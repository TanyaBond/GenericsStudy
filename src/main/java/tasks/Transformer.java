package tasks;

public interface Transformer<T, V> {


    V transform(T in);

//Interface Ffunction
    //HashMap realizzation
    // ENtry и сама реализация


    // stream api
    //stream 8 vs 7
    //lambda vs anonimus class


    //// 1 -> "1"
    //        // 1 -> 6
    //        // 1 -> 5 ->  * PI -> "Result = %s"
    //        System.out.println(new Transformer<Integer, Double>() {
    //            public Double transform(Integer in1) {
    //                return in1 * 2.0;
    //            }
    //        }.transform(2));
    //
    //        HashMap hashMap = new HashMap();

    default <Z> Transformer<T, Z> andThen(Transformer<V, Z> nextTrans) {

        return new Transformer<T, Z>() {
            @Override
            public Z transform(T in) {
                V v = Transformer.this.transform(in);
                Z z = nextTrans.transform(v);
                return z;
            }
        };

    }

    ;


}


// T -> V; V -> Z