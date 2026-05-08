package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaCallback;
import expo.modules.kotlin.jni.PromiseImpl;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly9a;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y9a extends sx9 {

    public static final class a implements gu5<Map<String, ? extends Object>> {
        public a() {
        }

        @Override // defpackage.gu5
        public final Map<String, ? extends Object> invoke() {
            NativeModulesProxy nativeModulesProxy;
            Map<String, ? extends Object> constants;
            WeakReference<NativeModulesProxy> weakReference = y9a.this.b().h;
            return (weakReference == null || (nativeModulesProxy = weakReference.get()) == null || (constants = nativeModulesProxy.getConstants()) == null) ? bs4.a : constants;
        }
    }

    public static final class b implements gu5<zf8> {
        public static final b a = new b();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class c implements gu5<zf8> {
        public static final c a = new c();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class d implements gu5<zf8> {
        public static final d a = new d();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ReadableArray.class);
        }
    }

    public static final class e implements Function2<Object[], p3c, j6g> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws UnexpectedException {
            NativeModulesProxy nativeModulesProxy;
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            ReadableArray readableArray = (ReadableArray) objArr2[2];
            String str = (String) obj2;
            String str2 = (String) obj;
            r3c r3cVar = new r3c(p3cVar2 instanceof PromiseImpl ? new s3c(1, ((PromiseImpl) p3cVar2).getCallback(), JavaCallback.class, "invoke", "invoke(Ljava/lang/Object;)V", 0) : new t3c(1, p3cVar2, p3c.class, "resolve", "resolve(Ljava/lang/Object;)V", 0), p3cVar2);
            WeakReference<NativeModulesProxy> weakReference = y9a.this.b().h;
            if (weakReference == null || (nativeModulesProxy = weakReference.get()) == null) {
                throw new UnexpectedException("The legacy modules proxy holder has been lost", null);
            }
            nativeModulesProxy.callMethod(str2, str, readableArray, r3cVar);
            return j6g.a;
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(y9a.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var = new vx9(this, 2);
            vx9Var.l = "NativeModulesProxy";
            vx9Var.b = new a();
            hb9 hb9Var = tf0.a;
            iwc iwcVar = fwc.a;
            yd8 yd8VarB = iwcVar.b(String.class);
            Boolean bool = Boolean.FALSE;
            Pair pair = new Pair(yd8VarB, bool);
            hb9 hb9Var2 = tf0.a;
            rf0 rf0Var = (rf0) hb9Var2.get(pair);
            if (rf0Var == null) {
                rf0Var = new rf0(new xp8(iwcVar.b(String.class), false, b.a), null);
            }
            rf0 rf0Var2 = (rf0) hb9Var2.get(new Pair(iwcVar.b(String.class), bool));
            if (rf0Var2 == null) {
                rf0Var2 = new rf0(new xp8(iwcVar.b(String.class), false, c.a), null);
            }
            rf0 rf0Var3 = (rf0) hb9Var2.get(new Pair(iwcVar.b(ReadableArray.class), bool));
            if (rf0Var3 == null) {
                rf0Var3 = new rf0(new xp8(iwcVar.b(ReadableArray.class), false, d.a), null);
            }
            vx9Var.f.put("callMethod", new ev0("callMethod", new rf0[]{rf0Var, rf0Var2, rf0Var3}, new e()));
            return vx9Var.k();
        } finally {
            Trace.endSection();
        }
    }
}
