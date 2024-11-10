import service.FileCreatorService;
import util.Constants;

public class Main {
    public static void main(String[] args) {

        FileCreatorService.addLine("## ---- Bloqueio de URLs no hosts ----- ##");
        FileCreatorService.addLine(Constants.URL_ZERO + Constants.SPACE +  Constants.GLOBO);

    }
}