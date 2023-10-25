package badCode.d;

class NotificationService {
    private Notification notification;


    NotificationService(Notification notification) {
            this.notification=notification;
    }

   public void sendNotification(String message){
        notification.sendMessage(message);
   }
}
