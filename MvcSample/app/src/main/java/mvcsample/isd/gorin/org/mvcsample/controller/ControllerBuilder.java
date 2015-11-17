package mvcsample.isd.gorin.org.mvcsample.controller;

/**
 * Created by makoto on 2015/09/26.
 */
public final class ControllerBuilder {

    private static final SampleController instance = new SampleController();

    public static SampleController getInstance(){
        return instance;
    }
}
