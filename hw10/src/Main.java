public class Main {

        public static void main(String[] args) {
            try {
                throw new StringException("a");
            } catch (StringException e) {
                e.getOuterMessage();
            }
        }
    }


