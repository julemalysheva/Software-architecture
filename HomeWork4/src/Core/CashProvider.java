package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.BankAccount;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

    private long cardNumber;
    private boolean isAuthorized;
    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;


    /**
     * Конструктор класса
     * isAuthorized - по умолчанию Нет Авторизации в банке
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
        //?
        this.isAuthorized = false;
    }

    
    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) throws RuntimeException{
        boolean buyResult = false;
        if (isAuthorized) {
            Carrier carrier = carrierRepository.read(1);
            buyResult = cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        } else {
            throw new RuntimeException("Not Authorized"); 
        }
        return buyResult;
    }


    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        for (BankAccount account : ((CashRepository) cashRepository).getClients()) {
            if (account.getCard() == client.getCardNumber()) {
                this.isAuthorized = true;
                this.cardNumber = client.getCardNumber();
            }
        }
    }


   

}
