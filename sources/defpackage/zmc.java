package defpackage;

import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.defaults.b;
import com.indeed.android.jobsearch.JobSearchApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zmc extends b {
    public final JobSearchApplication.b d;
    public final ArrayList e;
    public final ht0<String, Method> f;

    public static final class a implements ylc {
        public a(boolean z) {
        }

        @Override // defpackage.ylc
        public final void a(ReactApplicationContext reactApplicationContext) {
            Iterator it = zmc.this.e.iterator();
            while (it.hasNext()) {
                ((xmc) it.next()).getClass();
            }
        }
    }

    public zmc(JobSearchApplication jobSearchApplication, JobSearchApplication.b bVar) {
        super(jobSearchApplication);
        this.d = bVar;
        List list = (List) b45.b.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kya) it.next()).a();
            List list2 = Collections.EMPTY_LIST;
            list2.getClass();
            w92.w0(arrayList, list2);
        }
        this.e = arrayList;
        this.f = new ht0<>();
    }

    @Override // defpackage.wmc
    public final fmc createReactInstanceManager() throws IllegalAccessException, NoSuchFieldException {
        boolean zD = d();
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xmc) it.next()).getClass();
        }
        fmc fmcVarCreateReactInstanceManager = super.createReactInstanceManager();
        fmcVarCreateReactInstanceManager.getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((xmc) it2.next()).getClass();
        }
        fmcVarCreateReactInstanceManager.q.add(new a(zD));
        Field declaredField = wmc.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this.d, fmcVarCreateReactInstanceManager);
        return fmcVarCreateReactInstanceManager;
    }

    @Override // defpackage.wmc
    public final boolean d() {
        Boolean bool = (Boolean) a7e.S(a7e.V(z92.G0(this.e), new rg(13)));
        if (bool != null) {
            return bool.booleanValue();
        }
        this.d.getClass();
        return false;
    }

    public final <T> T g(String str) throws NoSuchMethodException {
        ht0<String, Method> ht0Var = this.f;
        Method declaredMethod = ht0Var.get(str);
        if (declaredMethod == null) {
            declaredMethod = wmc.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            ht0Var.put(str, declaredMethod);
        }
        return (T) declaredMethod.invoke(this.d, null);
    }

    @Override // defpackage.wmc
    public final String getBundleAssetName() {
        String str = (String) a7e.S(a7e.V(z92.G0(this.e), new k1(this, 14)));
        return str == null ? (String) g("getBundleAssetName") : str;
    }

    @Override // defpackage.wmc
    public final String getJSBundleFile() {
        String str = (String) a7e.S(a7e.V(z92.G0(this.e), new fj(this, 18)));
        return str == null ? (String) g("getJSBundleFile") : str;
    }

    @Override // defpackage.wmc
    public final String getJSMainModuleName() {
        return (String) g("getJSMainModuleName");
    }

    @Override // defpackage.wmc
    public final JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) a7e.S(a7e.V(z92.G0(this.e), new nf(23)));
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) g("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // defpackage.wmc
    public final List<inc> getPackages() {
        return (List) g("getPackages");
    }
}
