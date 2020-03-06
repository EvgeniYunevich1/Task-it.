
    public class Bankomat {
        private int numberOfTwentyDollars = 0;
        private int numberOfFiftyDollars = 0;
        private int numberOfOneHundredDollars = 0;

        public Bankomat(int numberOfTwentyDollars, int numberOfFiftyDollars, int numberOfOneHundredDollars) {
            this.numberOfTwentyDollars = numberOfTwentyDollars;
            this.numberOfFiftyDollars = numberOfFiftyDollars;
            this.numberOfOneHundredDollars = numberOfOneHundredDollars;
        }

        public void addCash(int numberOfTwentyDollars, int numberOfFiftyDollars, int numberOfOneHundredDollars){
            this.numberOfTwentyDollars+=numberOfTwentyDollars;
            this.numberOfFiftyDollars+=numberOfFiftyDollars;
            this.numberOfOneHundredDollars+=numberOfOneHundredDollars;

        }

        public boolean getCash(int cash){

            if(!checkValidCash(cash)){
                return false;
            }

            String message = calculateCash(cash);

            printMessage(message);

            return true;
        }

        private String calculateCash(int cash){
            StringBuilder message = new StringBuilder("Bankomat give you cash. ");
            int numberOfOneHundredDollars = cash / 100;

            if(numberOfOneHundredDollars > this.numberOfOneHundredDollars){
                numberOfOneHundredDollars = this.numberOfOneHundredDollars;
            }
            this.numberOfOneHundredDollars = this.numberOfOneHundredDollars - numberOfOneHundredDollars;
            cash -= numberOfOneHundredDollars*100;
            message.append("100: ").append(numberOfOneHundredDollars).append(", ");

            int numberOfFiftyDollars = cash / 50;

            if(numberOfFiftyDollars > this.numberOfFiftyDollars){
                numberOfFiftyDollars = this.numberOfFiftyDollars;
            }

            this.numberOfFiftyDollars = this.numberOfFiftyDollars - numberOfFiftyDollars;
            cash -= numberOfFiftyDollars*100;
            message.append("50: ").append(numberOfFiftyDollars).append(", ");

            int numberOfTwentyDollars = cash / 50;

            if(numberOfTwentyDollars > this.numberOfTwentyDollars){
                numberOfTwentyDollars = this.numberOfTwentyDollars;
            }

            this.numberOfTwentyDollars = this.numberOfTwentyDollars - numberOfTwentyDollars;
        cash -= numberOfTwentyDollars*100;
            message.append("20: ").append(numberOfTwentyDollars).append(".");

            return  message.toString();
    }



        private void printMessage(String txt){
            System.out.println(txt);
        }
        private boolean checkValidCash(int cash){
           if(cash % 20 != 0 ){
               System.out.println("It is not valid cash. Please repeat operation with valid cash!"); // to do w main
               return false;
            }
            return true;
      }
    }

