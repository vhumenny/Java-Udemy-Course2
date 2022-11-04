//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class FutureEx {
//        private ExecutorService executor
//                = Executors.newFixedThreadPool(10);
//
//        public Future<Integer> calculate(Integer input) {
//            return executor.submit(() -> {
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                return input * input;
//            });
////        }
//
//        public static void main(String[] args) throws ExecutionException, InterruptedException {
//            Future<Integer> future = new SquareCalculator().calculate(10);
//            Integer result1 = future.get();
//
//            Future<?> future2 = new SquareCalculator().calculate(20);
//            Integer result2 = future.get();
//
//            Future<?> future3 = new SquareCalculator().calculate(30);
//            Integer result3 = future.get();
//
//            System.out.println(result1 + result2 + result3);
//        }
//    }
//
//}
