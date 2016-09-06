package fluxui;

import fluxui.store.Store;
import fluxui.action.Action;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by Cronixx on 06.09.2016.
 */
public final class Dispatcher {
    private static Dispatcher instance = new Dispatcher();
    private List<Store> stores = new LinkedList<>();

    private Dispatcher() {}

    public static Dispatcher getInstance() {
        return instance;
    }

    public void registerStore(Store store) {
        stores.add(store);
    }



    private void dispatchAction(Action action) {
        stores.stream().forEach(store -> store.onAction(action));
    }
}
