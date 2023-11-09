import java.util.ArrayList;
import java.util.List;

public class Api {
    private List<String> acountBankList;

    public Api() {
        acountBankList = new ArrayList<>();
    }

    public void add(String acountNumber) {
        acountBankList.add(acountNumber);
    }

    public List<String> getAcountBankList() {
        return acountBankList;
    }
}
