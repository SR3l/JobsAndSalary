public class Main {
    public static void main(String[] args) {

            int[] salary = {1830, 600, 1480, 580, 1040, 2000, 1460,
                    1150, 510, 1050, 1760, 1870, 1430, 1160, 1770, 550,
                    1570, 2000, 1180, 630, 840, 1530, 1210, 1780, 690, 1110,
                    1020, 660, 890, 620};
            String[] jobs = {"Sales", "HR", "R&D", "Sales", "Sales",
                    "ACCT", "HR", " R&D", " R&D", "Sales", "HR", "Sales",
                    " R&D", " R&D", "ACCT", "HR", "Sales", " R&D", " R&D",
                    "Sales", " R&D", "HR", "HR", "Sales", "Sales", "HR", "HR",
                    "ACCT", "ACCT", "HR"};

            printMethod("Total number of employees in the sales department",
                    getSalesDeptEmployeeCount(jobs));
            printMethod("Average weekly pay of all employees in the sales department",
                    getSalesDeptSalaryAverage(salary, jobs));
            printMethod("Total number of employees in the sales department making more than $1000 per week",
                    getSalesDeptSalaryMoreThan1k(salary, jobs));
            printMethod("The lowest salary of all employees",
                    getLowestSalary(salary));
            printMethod("Average weekly pay of all employees in all of the departments except sales department ",
                    getAllMinSalesDeptAverage(salary, jobs));

            int lowestSalaryJob = getLowestSalaryJob(jobs, salary);
            System.out.println("The job title corresponding to the employee with the lowest salary: " + jobs[lowestSalaryJob]);



        }
        // Method to get the number of employees in the sales department
        public static int getSalesDeptEmployeeCount(String[] jobs) {
            int count = 0;
            for (String job : jobs) {
                if (job.equals("Sales")) {
                    count++;
                }
            }
            return count;
        }
        // Method to get the average weekly pay of all employees in the sales department
        public static int getSalesDeptSalaryAverage(int[] salary, String[] jobs) {
            int count = 0;
            double sum = 0;
            for (int i = 0; i < salary.length; i++) {
                if (jobs[i].equals("Sales")) {
                    sum += salary[i];
                    count++;
                }
            }
            return (int) (sum / count);
        }
        // Method to get the total number of employees in the sales department making more than $1000 per week
        public static int getSalesDeptSalaryMoreThan1k(int[] salary, String[] jobs) {
            int count = 0;
            for (int i = 0; i < salary.length; i++) {
                if (jobs[i].equals("Sales") && salary[i] > 1000) {
                    count++;
                }
            }
            return count;
        }
        // Method to get the lowest salary of all employees
        public static int getLowestSalary(int[] salary) {
            int min = salary[0];
            for (int i = 1; i < salary.length; i++) {
                if (salary[i] < min) {
                    min = salary[i];
                }
            }
            return min;
        }
        // Method to get the job title corresponding to the employee with the lowest salary
        public static int getLowestSalaryJob(int[] salary) {
            int min = salary[0];
            int index = 0;
            for (int i = 1; i < salary.length; i++) {
                if (salary[i] < min) {
                    min = salary[i];
                    index = i;
                }
            }
            return index;
        }
        // Method to get the average weekly pay of all employees in all the departments except sales department
        public static int getAllMinSalesDeptAverage(int[] salary, String[] jobs) {
            int count = 0;
            double sum = 0;
            for (int i = 0; i < salary.length; i++) {
                if (!jobs[i].equals("Sales")) {
                    sum += salary[i];
                    count++;
                }
            }
            return (int) (sum / count);
        }
        // Method to print the message and the method value
        public static void printMethod(String message, int value) {
            System.out.print(message + ": " + value + "\n");
        }

    }

