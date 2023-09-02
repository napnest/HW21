package badCode.d;

class NotificationService {
    private EmailNotifier emailNotifier;
    private SMSNotifier smsNotifier;

    NotificationService() {
        emailNotifier = new EmailNotifier();
        smsNotifier = new SMSNotifier();
    }

    void sendNotification(String recipient, String message, String deliveryMethod) {
        if (deliveryMethod.equals("email")) {
            emailNotifier.sendEmail(recipient, message);
        } else if (deliveryMethod.equals("sms")) {
            smsNotifier.sendSMS(recipient, message);
        }
    }
}
