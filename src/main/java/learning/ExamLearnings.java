package learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExamLearnings {

    static final int MINUTE_PER_HOURS = 60;

    private Map<String, Double> learnings = new LinkedHashMap<>();

    public Map<String, Double> getLearnings() {
        return new HashMap<>(learnings);
    }

    public void readFromFile(Path p) {
        try (
                BufferedReader br = Files.newBufferedReader(p)) {
            String line;
            while ((line = br.readLine()) != null) {
                parseLine(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.");
        }
    }

    private void parseLine(String line) {
        String[] temp = line.split(";");
        if (!getLearnings().containsKey(temp[0])) {
            learnings.put(temp[0], 0.0);
        }
        double sum = 0.0;
        for (int i = 1; i < temp.length; i++) {
            sum += Double.parseDouble(temp[i].replace(',', '.'));
        }
        learnings.put(temp[0], (sum * MINUTE_PER_HOURS));
    }

    public double getAverageLearningInMinutes() {
        double sum = 0;
        int counter = 0;
        if (learnings.size() == 0) {
            throw new IllegalArgumentException("There are no learning times.");
        } else {

            for (Map.Entry<String, Double> e : learnings.entrySet()) {
                sum += e.getValue();
                counter++;
            }
            return sum / counter;
        }
    }

}
