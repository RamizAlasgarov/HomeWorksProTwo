package ZYUR._24_06_02.demo.executor;

public interface Executor<T,R>{
    R execute(T val, T val2,T val3);
}
