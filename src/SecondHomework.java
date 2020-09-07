import java.util.HashMap;

    public class SecondHomework {

        //первое задание из домашки
        public void first(String input) {
            System.out.println(input.charAt(input.length()-1));
        }

        //второе задание из домашки
        public void second(String input){
            int sum = 0;
            for(int i = 0; i < input.length(); i++)
            {
                sum += Integer.parseInt(input.substring(i, i + 2));
            }
            System.out.println(sum);
        }

        //третье задание из домашки
        public void third(String input){
            int number = Integer.parseInt(input);
            if(number > 0)
                number++;
            System.out.println(number);
        }

        //четвертое задние из домашки
        public void fourth(String input){
            int number = Integer.parseInt(input);
            if(number > 0)
                number++;
            else if(number < 0)
                number -= 2;
            else
                number = 10;
            System.out.println(number);
        }

        //пятое задание из домашки
        public void fifth(String first_number, String second_number, String third_number){
            int min = Integer.parseInt(first_number);
            if(min > Integer.parseInt(second_number))
                min = Integer.parseInt(second_number);
            if(min > Integer.parseInt(third_number))
                min = Integer.parseInt(third_number);
            System.out.println(min);
        }

        //шестое задание из домашки
        public void sixth(String input){
            int number = Integer.parseInt(input);
            String firstParameter = "";
            String secondParameter = "";
            if(number > 0)
                firstParameter = "положительное";
            else if(number < 0)
                firstParameter = "отрицательное";
            else
                firstParameter = "нулевое";

            if(firstParameter != "нулевое")
            {
                if(number % 2 == 0)
                    secondParameter = "четное";
                else
                    secondParameter = "нечетное";
            }

            if(firstParameter != "нулевое")
                System.out.println(firstParameter + "и" + secondParameter);
            else
                System.out.println(firstParameter);

        }

        //7 задание из домашки
        public void seven(String input){
            if(input == "905")
                System.out.println("Москва. Стоимость разговора " + 4.15 * 10);
            else if(input == "194")
                System.out.println("Ростов. Стоимость разговора " + 1.98 * 10);
            else if(input == "491")
                System.out.println("Краснодар. Стоимость разговора " + 2.69 * 10);
            else if(input == "800")
                System.out.println("Киров. Стоимость разговора " + 5.0 * 10);
            else
                System.out.println("Введенный код не распознан");
        }

        //8 задание из домашки
        public void eight(int[] input){
            int min = input[0];
            int sum = 0;
            int sum_of_negative_even = 0;
            int count_of_positive = 0;
            int average_of_negative = 0;
            for(int i = 0; i < input.length - 1; i++)
            {
                if(input[i]<min)
                    min = input[i];
                if(input[i]>=0){
                    sum +=input[i];
                    count_of_positive++;
                }
                if(input[i]<0){
                    average_of_negative += input[i];
                    if(input[i]%2 == -1)
                        sum_of_negative_even += input[i];
                }
            }
            if(count_of_positive != input.length)
                average_of_negative /= input.length - count_of_positive;

            System.out.println("максимальное значение = " + min + ", сумму положительных элементов = " + sum + ", сумму четных отрицательных элементов = " + sum_of_negative_even
                    + ", количество положительных элементов = " + count_of_positive + ", среднее арифметическое отрицательных элементов = " + average_of_negative);
        }

        //9 задание из домашки
        public void ninth(int[] input){
            boolean flag = false;
            int temp;
            while(!flag) {
                flag = true;
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i] > input[i+1]) {
                        temp = input[i];
                        input[i] = input[i+1];
                        input[i+1] = temp;
                        flag = false;
                    }
                }
            }
            for (int i = 0; i < input.length; i++) {
                System.out.println(input[i]);
            }
        }

        //10 задание из домашки
        public void ten(int[] input){
            int count_of_zero = 0;
            int last_out_of_zero = - 1;
            int temp;
            for(int i = 0; i < input.length; i++){
                if(input[i] == 0)
                {
                    if(i != 0 && i!= last_out_of_zero + 1)
                    {
                        temp = input[last_out_of_zero + 1];
                        input[last_out_of_zero + 1] = input[i];
                        input[i] = temp;
                        last_out_of_zero ++;
                    }
                }
            }
            for (int i = 0; i < input.length; i++) {
                System.out.println(input[i]);
            }
        }
    }


