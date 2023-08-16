package adapter;

public class Send implements iSend{
    @Override
    public String sendRequest(String requestData) {
        // Реализация отправки запроса
        return "Response data from server";
    }
}
