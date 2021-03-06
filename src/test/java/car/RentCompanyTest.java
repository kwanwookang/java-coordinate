package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RentCompanyTest {
    @Test
    void generateReport() {
        final RentCompany company = RentCompany.create();
        company.addCar(new Sonata(150))
                .addCar(new K5(260))
                .addCar(new Sonata(120))
                .addCar(new Avante(300))
                .addCar(new K5(390));
        assertThat(company.generateReport()).isEqualTo(
                "Sonata : 15리터\n" +
                "K5 : 20리터\n" +
                "Sonata : 12리터\n" +
                "Avante : 20리터\n" +
                "K5 : 30리터\n"
        );
    }
}