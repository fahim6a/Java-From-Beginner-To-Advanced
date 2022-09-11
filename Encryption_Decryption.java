public class Encryption_Decryption {
    public static void main(String[] args) {
        // we want to send a msg to our beloved. but at the same time you want
        // to hide the msg from third-party user/viewer. so what to do you now?
        // first we encryption our massage and send to the beloved
        // now let's get started.
        char msg = 'E';
        // now we have to add extra bit to encrypt it
        msg= (char)(msg+16); // char + int = int result. so we have to type casting
        System.out.println(msg);

        // now we have to decrypt our msg
        msg = (char)(msg-16);
        System.out.println(msg);

    }
}
