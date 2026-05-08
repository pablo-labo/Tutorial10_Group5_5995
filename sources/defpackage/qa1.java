package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\tJ-\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u0016\u0012\u0006\b\u0000\u0012\u00020\u00160\u00150\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lqa1;", "Linc;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "", "name", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "", "Lcom/facebook/react/bridge/ModuleHolder;", "getNativeModuleIterator$ReactAndroid_release", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;", "getNativeModuleIterator", "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "", "createViewManagers", "Lomc;", "getReactModuleInfoProvider", "()Lomc;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class qa1 implements inc {

    public final class a implements Provider<NativeModule> {
        public final String a;
        public final ReactApplicationContext b;
        public final /* synthetic */ qa1 c;

        public a(qa1 qa1Var, ReactApplicationContext reactApplicationContext, String str) {
            str.getClass();
            this.c = qa1Var;
            this.a = str;
            this.b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        public final NativeModule get() {
            return this.c.getModule(this.a, this.b);
        }
    }

    public static final class b implements Iterable<ModuleHolder>, ze8 {
        public final /* synthetic */ Iterator a;
        public final /* synthetic */ qa1 b;
        public final /* synthetic */ ReactApplicationContext c;

        public b(Iterator it, qa1 qa1Var, ReactApplicationContext reactApplicationContext) {
            this.a = it;
            this.b = qa1Var;
            this.c = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public final Iterator<ModuleHolder> iterator() {
            return new c(this.a, this.b, this.c);
        }
    }

    public static final class c implements Iterator<ModuleHolder>, ze8 {
        public Map.Entry<String, ReactModuleInfo> a;
        public final /* synthetic */ Iterator<Map.Entry<String, ReactModuleInfo>> b;
        public final /* synthetic */ qa1 c;
        public final /* synthetic */ ReactApplicationContext d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Iterator<? extends Map.Entry<String, ReactModuleInfo>> it, qa1 qa1Var, ReactApplicationContext reactApplicationContext) {
            this.b = it;
            this.c = qa1Var;
            this.d = reactApplicationContext;
        }

        public final void a() {
            Map.Entry<String, ReactModuleInfo> next;
            ReactModuleInfo value;
            do {
                Iterator<Map.Entry<String, ReactModuleInfo>> it = this.b;
                if (!it.hasNext()) {
                    this.a = null;
                    return;
                }
                next = it.next();
                value = next.getValue();
                if (!ie7.g0.useTurboModules()) {
                    break;
                }
            } while (value.f);
            this.a = next;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.a == null) {
                a();
            }
            return this.a != null;
        }

        @Override // java.util.Iterator
        public final ModuleHolder next() {
            if (this.a == null) {
                a();
            }
            Map.Entry<String, ReactModuleInfo> entry = this.a;
            if (entry == null) {
                s6.j("ModuleHolder not found");
                return null;
            }
            a();
            ReactModuleInfo value = entry.getValue();
            String key = entry.getKey();
            return new ModuleHolder(value, new a(this.c, this.d, key));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // defpackage.inc
    @sy3
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        reactContext.getClass();
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // defpackage.inc
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        reactContext.getClass();
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        List<ModuleSpec> list = viewManagers;
        if (list == null || list.isEmpty()) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            NativeModule nativeModule = it.next().provider().get();
            nativeModule.getClass();
            arrayList.add((ViewManager) nativeModule);
        }
        return arrayList;
    }

    public abstract NativeModule getModule(String name, ReactApplicationContext reactContext);

    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(ReactApplicationContext reactContext) {
        reactContext.getClass();
        return new b(getReactModuleInfoProvider().a().entrySet().iterator(), this, reactContext);
    }

    public abstract omc getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactContext) {
        reactContext.getClass();
        return zr4.a;
    }
}
