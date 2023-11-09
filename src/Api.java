import java.util.List;

public class Api {
    private List<String> acountBackList;

    public Api() {

    }

    public void add(String acountNumber) {
        acountBackList.add(acountNumber);
    }

    public List<String> getAcountBackList() {
        return acountBackList;
    }
}
