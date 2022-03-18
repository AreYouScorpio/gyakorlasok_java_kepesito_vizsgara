package cloud;

import java.util.Comparator;
import java.util.List;

public class CloudStorage implements Comparable<CloudStorage> {

    private String provider;
    private int space;
    private PayPeriod payPeriod;
    private double price;

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price) {
        this.provider = provider;
        this.space = space;
        this.payPeriod = payPeriod;
        this.price = price;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }

    public double getPrice() {
        return price;
    }

    public List<CloudStorage> compareTo(List<CloudStorage> cloudStorages){
        cloudStorages.sort(Comparator.comparing(p->p.getPayPeriod()));
        return cloudStorages;
    }


    @Override
    public int compareTo(CloudStorage o) {
        double x = this.payPeriod != null ? this.price*12 / this.payPeriod.getLength() / this.space*1000 :0;
        double y = o.payPeriod != null ? o.price*12 / o.payPeriod.getLength() / o.space*1000 :0;
        return Double.compare(x,y);
    }
}
