import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        LocalDate dataAgoraLocal = LocalDate.now();
        System.out.println(dataAgoraLocal);
        LocalDateTime dataAgoraLocalcomHorario = LocalDateTime.now();
        System.out.println(dataAgoraLocalcomHorario);

        Instant horarioGMTLondres = Instant.now();
        System.out.println(horarioGMTLondres);

        LocalDate d04 = LocalDate.parse("2022-07-20"); //usando o formato iso

        //formatando as datas - customização
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(d04.format(fmt1));

    }
}
