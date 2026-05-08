package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.sx9;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.MethodNotFoundException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zx9<T extends sx9> {
    public final T a;
    public final wx9 b;
    public boolean c;
    public final d2f d = new d2f(new oj(this, 13));

    public static final class a implements JNIFunctionBody {
        public final /* synthetic */ zx9<T> a;

        public a(zx9<T> zx9Var) {
            this.a = zx9Var;
        }

        @Override // expo.modules.kotlin.jni.JNIFunctionBody
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return this.a.b.a;
        }
    }

    public static final class b implements Function2<String, rqg, j6g> {
        public final /* synthetic */ JNIDeallocator a;
        public final /* synthetic */ JSDecoratorsBridgingObject b;
        public final /* synthetic */ zx9<T> c;
        public final /* synthetic */ gk0 d;

        public b(JNIDeallocator jNIDeallocator, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, zx9<T> zx9Var, gk0 gk0Var) {
            this.a = jNIDeallocator;
            this.b = jSDecoratorsBridgingObject;
            this.c = zx9Var;
            this.d = gk0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(String str, rqg rqgVar) {
            String str2;
            String str3 = str;
            rqg rqgVar2 = rqgVar;
            str3.getClass();
            rqgVar2.getClass();
            List<s81> list = rqgVar2.h;
            if (!list.isEmpty()) {
                JNIDeallocator jNIDeallocator = this.a;
                JSDecoratorsBridgingObject jSDecoratorsBridgingObject = this.b;
                wx9 wx9Var = this.c.b;
                gk0 gk0Var = this.d;
                Trace.beginSection(jpf.g("[ExpoModulesCore] Attaching view prototype"));
                try {
                    JSDecoratorsBridgingObject jSDecoratorsBridgingObject2 = new JSDecoratorsBridgingObject(jNIDeallocator);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((s81) it.next()).a(gk0Var, jSDecoratorsBridgingObject2, wx9Var.a);
                    }
                    if (str3.hashCode() == 764185466 && str3.equals("DEFAULT_MODULE_VIEW")) {
                        str2 = wx9Var.a;
                    } else {
                        str2 = wx9Var.a + "_" + rqgVar2.a;
                    }
                    jSDecoratorsBridgingObject.registerObject(str2, jSDecoratorsBridgingObject2);
                    j6g j6gVar = j6g.a;
                } finally {
                    Trace.endSection();
                }
            }
            return j6g.a;
        }
    }

    public static final class c implements BiConsumer {
        public final /* synthetic */ b a;

        public c(b bVar) {
            this.a = bVar;
        }

        @Override // java.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.a.invoke(obj, obj2);
        }
    }

    public zx9(T t) {
        this.a = t;
        this.b = t.a();
    }

    public static final void a(zx9 zx9Var, gk0 gk0Var, jna jnaVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        Trace.beginSection(jpf.g("[ExpoModulesCore] Exporting constants"));
        try {
            WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap(jnaVar.a.invoke());
            writableNativeMapMakeNativeMap.getClass();
            jSDecoratorsBridgingObject.registerConstants(writableNativeMapMakeNativeMap);
            Iterator it = jnaVar.f.entrySet().iterator();
            while (it.hasNext()) {
                sp2 sp2Var = (sp2) ((Map.Entry) it.next()).getValue();
                sp2Var.getClass();
                jSDecoratorsBridgingObject.registerConstant(sp2Var.a, new rp2(sp2Var, 0));
            }
            j6g j6gVar = j6g.a;
            Trace.endSection();
            Trace.beginSection(jpf.g("[ExpoModulesCore] Attaching functions"));
            try {
                fn2<qf0> fn2VarA = jnaVar.a();
                while (fn2VarA.hasNext()) {
                    fn2VarA.next().a(gk0Var, jSDecoratorsBridgingObject, str);
                }
                j6g j6gVar2 = j6g.a;
                Trace.endSection();
                Trace.beginSection(jpf.g("[ExpoModulesCore] Attaching properties"));
                try {
                    Iterator it2 = jnaVar.e.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((a4c) ((Map.Entry) it2.next()).getValue()).a(gk0Var, jSDecoratorsBridgingObject);
                    }
                    j6g j6gVar3 = j6g.a;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void b(String str, Object[] objArr, pf8 pf8Var) throws FunctionCallException {
        CodedException unexpectedException;
        wx9 wx9Var = this.b;
        try {
            s81 s81Var = (s81) wx9Var.h.get(str);
            if (s81Var == null) {
                throw new MethodNotFoundException();
            }
            if (s81Var instanceof dv0) {
                ((dv0) s81Var).g(objArr, pf8Var, this.a.b());
                j6g j6gVar = j6g.a;
            } else {
                throw new IllegalStateException("Cannot call a " + s81Var + " method in test context");
            }
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw new FunctionCallException(str, wx9Var.a, unexpectedException);
        }
    }

    public final void c(i05 i05Var) {
        dz4 dz4Var = this.b.d.get(i05Var);
        if (dz4Var == null) {
            return;
        }
        nc1 nc1Var = dz4Var instanceof nc1 ? (nc1) dz4Var : null;
        if (nc1Var != null) {
            nc1Var.a.invoke();
        }
    }

    public final <Sender, Payload> void d(i05 i05Var, Sender sender, Payload payload) {
        dz4 dz4Var = this.b.d.get(i05Var);
        if (dz4Var == null) {
            return;
        }
        fz4 fz4Var = dz4Var instanceof fz4 ? (fz4) dz4Var : null;
        if (fz4Var != null) {
            fz4Var.a.invoke(sender, payload);
        }
    }
}
