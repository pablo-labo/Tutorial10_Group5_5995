package defpackage;

import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfFour;
import expo.modules.kotlin.types.EitherOfThree;
import expo.modules.kotlin.types.ValueOrUndefined;
import expo.modules.kotlin.types.a;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class fxf implements pwf {
    public static final fxf a = new fxf();
    public static final LinkedHashMap b;
    public static final Map<yd8<?>, owf<?>> c;
    public static final LinkedHashMap d;

    static {
        s23 s23Var = s23.b;
        qwf qwfVar = new qwf(new ExpectedType(s23Var));
        s23 s23Var2 = s23.c;
        rwf rwfVar = new rwf(new ExpectedType(s23Var2));
        s23 s23Var3 = s23.a;
        swf swfVar = new swf(new ExpectedType(s23Var3));
        s23 s23Var4 = s23.d;
        twf twfVar = new twf(new ExpectedType(s23Var4));
        s23 s23Var5 = s23.e;
        uwf uwfVar = new uwf(new ExpectedType(s23Var5));
        iwc iwcVar = fwc.a;
        b = lc9.c0(lc9.a0(new Pair(iwcVar.b(Integer.TYPE), qwfVar), new Pair(iwcVar.b(Integer.class), qwfVar), new Pair(iwcVar.b(Long.TYPE), rwfVar), new Pair(iwcVar.b(Long.class), rwfVar), new Pair(iwcVar.b(Double.TYPE), swfVar), new Pair(iwcVar.b(Double.class), swfVar), new Pair(iwcVar.b(Float.TYPE), twfVar), new Pair(iwcVar.b(Float.class), twfVar), new Pair(iwcVar.b(Boolean.TYPE), uwfVar), new Pair(iwcVar.b(Boolean.class), uwfVar), new Pair(iwcVar.b(String.class), new vwf(new ExpectedType(s23.f))), new Pair(iwcVar.b(ReadableArray.class), new wwf(new ExpectedType(s23.X))), new Pair(iwcVar.b(ReadableMap.class), new xwf(new ExpectedType(s23.Y))), new Pair(iwcVar.b(byte[].class), new er1()), new Pair(iwcVar.b(JavaScriptValue.class), new ywf(new ExpectedType(s23.W))), new Pair(iwcVar.b(JavaScriptObject.class), new zwf(new ExpectedType(s23.V))), new Pair(iwcVar.b(xg7.class), new zg7(yg7.a)), new Pair(iwcVar.b(pg7.class), new rg7(qg7.a)), new Pair(iwcVar.b(sg7.class), new ug7(tg7.a)), new Pair(iwcVar.b(n5g.class), new p5g(o5g.a)), new Pair(iwcVar.b(q5g.class), new s5g(r5g.a)), new Pair(iwcVar.b(h5g.class), new j5g(i5g.a)), new Pair(iwcVar.b(k5g.class), new m5g(l5g.a)), new Pair(iwcVar.b(th5.class), new vh5(uh5.a)), new Pair(iwcVar.b(wh5.class), new yh5(xh5.a)), new Pair(iwcVar.b(cf1.class), new ef1(df1.a)), new Pair(iwcVar.b(hf1.class), new jf1(if1.a)), new Pair(iwcVar.b(pyf.class), new ryf(new rg(15))), new Pair(iwcVar.b(URL.class), new ae4(1)), new Pair(iwcVar.b(Uri.class), new qhg()), new Pair(iwcVar.b(URI.class), new ww7()), new Pair(iwcVar.b(File.class), new ya5()), new Pair(iwcVar.b(wd4.class), new ae4(0)), new Pair(iwcVar.b(Object.class), new sf0()), new Pair(iwcVar.b(j6g.class), new p6g()), new Pair(iwcVar.b(kqc.class), new lqc())), lc9.a0(new Pair(iwcVar.b(Path.class), new m6b()), new Pair(iwcVar.b(Color.class), new cb2()), new Pair(iwcVar.b(LocalDate.class), new sg3())));
        c = lc9.a0(new Pair(iwcVar.b(int[].class), new axf(ExpectedType.a.a(s23Var))), new Pair(iwcVar.b(long[].class), new bxf(ExpectedType.a.a(s23Var2))), new Pair(iwcVar.b(double[].class), new cxf(ExpectedType.a.a(s23Var3))), new Pair(iwcVar.b(float[].class), new dxf(ExpectedType.a.a(s23Var4))), new Pair(iwcVar.b(boolean[].class), new exf(ExpectedType.a.a(s23Var5))));
        d = new LinkedHashMap();
    }

    @Override // defpackage.pwf
    public final owf<?> a(zf8 zf8Var) {
        zf8Var.getClass();
        owf<?> qt0Var = (owf) b.get(zf8Var.a());
        if (qt0Var == null) {
            oe8 oe8VarA = zf8Var.a();
            yd8 yd8Var = oe8VarA instanceof yd8 ? (yd8) oe8VarA : null;
            if (yd8Var == null) {
                throw new MissingTypeConverter(zf8Var);
            }
            Class clsP = jh2.p(yd8Var);
            if (clsP.isArray() || Object[].class.isAssignableFrom(clsP)) {
                if ((clsP.equals(boolean[].class) || clsP.equals(byte[].class) || clsP.equals(char[].class) || clsP.equals(short[].class) || clsP.equals(int[].class) || clsP.equals(long[].class) || clsP.equals(float[].class) || clsP.equals(double[].class)) ? zf8Var.g().isEmpty() : false) {
                    qt0Var = c.get(zf8Var.a());
                    if (qt0Var == null) {
                        throw new MissingTypeConverter(zf8Var);
                    }
                } else {
                    qt0Var = new qt0(this, zf8Var);
                }
            } else if (List.class.isAssignableFrom(clsP)) {
                qt0Var = new ez8(this, zf8Var);
            } else if (Map.class.isAssignableFrom(clsP)) {
                qt0Var = new zb9(this, zf8Var);
            } else if (Pair.class.isAssignableFrom(clsP)) {
                qt0Var = new c3b(this, zf8Var);
            } else if (Set.class.isAssignableFrom(clsP)) {
                qt0Var = new uae(this, zf8Var);
            } else if (clsP.isEnum()) {
                qt0Var = new cw4(yd8Var);
            } else {
                LinkedHashMap linkedHashMap = d;
                owf<?> owfVar = (owf) linkedHashMap.get(zf8Var);
                if (owfVar != null) {
                    qt0Var = owfVar;
                } else if (ftc.class.isAssignableFrom(clsP)) {
                    itc itcVar = new itc(this, zf8Var);
                    linkedHashMap.put(zf8Var, itcVar);
                    qt0Var = itcVar;
                } else if (View.class.isAssignableFrom(clsP)) {
                    qt0Var = new fsg<>(zf8Var);
                } else if (SharedRef.class.isAssignableFrom(clsP)) {
                    qt0Var = new sde<>(zf8Var);
                } else if (SharedObject.class.isAssignableFrom(clsP)) {
                    qt0Var = new rde<>(zf8Var);
                } else if (JavaScriptFunction.class.isAssignableFrom(clsP)) {
                    qt0Var = new xv7<>(zf8Var);
                } else if (ValueOrUndefined.class.isAssignableFrom(clsP)) {
                    qt0Var = new a(this, zf8Var);
                } else {
                    qt0Var = Either.class.isAssignableFrom(clsP) ? EitherOfFour.class.isAssignableFrom(clsP) ? new dp4<>(this, zf8Var) : EitherOfThree.class.isAssignableFrom(clsP) ? new ep4<>(this, zf8Var) : new fp4<>(this, zf8Var) : null;
                    if (qt0Var == null) {
                        throw new MissingTypeConverter(zf8Var);
                    }
                }
            }
        }
        return zf8Var.i() ? new vma(qt0Var) : qt0Var;
    }
}
