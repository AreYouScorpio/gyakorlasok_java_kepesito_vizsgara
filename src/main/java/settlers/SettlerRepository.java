package settlers;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class SettlerRepository {

    private JdbcTemplate jdbcTemplate;

    public SettlerRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }



    public long saveNewSettler(Settler settler) {


        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into settlers(id, name_of_settler, amount_of_tobacco, expected_income) values(?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, settler.getId());
            ps.setString(2, settler.getNameOfSettler());
            ps.setLong(3, settler.getAmountOfTobacco());
            ps.setLong(4, settler.getExpectedIncome());
            return ps;
        }, holder);
        return holder.getKey().longValue();


    }

    public Settler findSettlerById(long id) {

        return jdbcTemplate.queryForObject("select id, name_of_settler, amount_of_tobacco, expected_income from settlers where id=?",
                (rs, rowNum) -> new Settler(rs.getLong("id"), rs.getString("name_of_settler"),
                        rs.getLong("amount_of_tobacco"), rs.getLong("expected_income")), id);

    }


    public void updateGrowthAndIncome(long id, int amount){
        jdbcTemplate.update("update settlers set amount_of_tobacco = amount_of_tobacco - ? where id = ?", amount, id);
        jdbcTemplate.update("update settlers set expected_income = expected_income - ? where id = ?", amount*Settler.PRICE_PER_TON, id);


    }
}
