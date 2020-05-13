class GenericClass<T> {
        private T variable;

        public void set(T input){
            variable = input;
        }
        public void get(){
            System.out.println(variable);
        }

        public static void main(String[] Args){

            GenericClass gen = new GenericClass<Integer>();
            gen.set(3);
            gen.get();

            GenericClass gen1 =new GenericClass<String>();
            gen1.set("Generic class");
            gen1.get();

        }
    }

