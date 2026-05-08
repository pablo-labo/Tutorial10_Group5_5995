package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import defpackage.ds3;
import defpackage.l;
import defpackage.me4;
import defpackage.wl7;
import defpackage.x5g;
import defpackage.yy2;
import defpackage.z67;
import defpackage.zf8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/types/Either;", "", "FirstType", "SecondType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Either<FirstType, SecondType> {
    public final Object a;
    public final ArrayList b;
    public final List<zf8> c;

    public Either(Object obj, ArrayList arrayList, List list) {
        this.a = obj;
        this.b = arrayList;
        this.c = list;
    }

    public final Object a(int i) {
        ArrayList arrayList = this.b;
        ds3 ds3Var = (ds3) arrayList.get(i);
        if (ds3Var instanceof yy2) {
            return ((yy2) ds3Var).a;
        }
        boolean zB = wl7.b(ds3Var, z67.a);
        Object obj = this.a;
        List<zf8> list = this.c;
        if (zB) {
            throw new TypeCastException("Cannot cast '" + obj + "' to '" + list.get(i) + "'");
        }
        Object objValueOf = null;
        if (!(ds3Var instanceof x5g)) {
            l.g();
            return null;
        }
        try {
            x5g x5gVar = (x5g) ds3Var;
            if (x5gVar.d == null) {
                x5gVar.d = x5gVar.b.a(x5gVar.a, x5gVar.c.get(), true);
            }
            Object obj2 = x5gVar.d;
            obj2.getClass();
            arrayList.set(i, new yy2(obj2));
            return obj2;
        } catch (Throwable th) {
            arrayList.set(i, z67.a);
            if (!(obj instanceof Dynamic)) {
                throw new TypeCastException("Cannot cast '" + obj + "' to '" + list.get(i) + "' - " + th.getMessage());
            }
            Dynamic dynamic = (Dynamic) obj;
            switch (me4.a[dynamic.getType().ordinal()]) {
                case 1:
                    break;
                case 2:
                    objValueOf = Boolean.valueOf(dynamic.asBoolean());
                    break;
                case 3:
                    objValueOf = Double.valueOf(dynamic.asDouble());
                    break;
                case 4:
                    objValueOf = dynamic.asString();
                    break;
                case 5:
                    objValueOf = dynamic.asArray();
                    break;
                case 6:
                    objValueOf = dynamic.asMap();
                    break;
                default:
                    l.g();
                    return null;
            }
            throw new TypeCastException("Cannot cast '[" + obj + "] " + objValueOf + "' to '" + list.get(i) + "' - " + th.getMessage());
        }
    }

    public final boolean b(int i) {
        ArrayList arrayList = this.b;
        ds3 ds3Var = (ds3) arrayList.get(i);
        if (ds3Var instanceof yy2) {
            return true;
        }
        if (wl7.b(ds3Var, z67.a)) {
            return false;
        }
        if (!(ds3Var instanceof x5g)) {
            l.g();
            return false;
        }
        try {
            x5g x5gVar = (x5g) ds3Var;
            if (x5gVar.d == null) {
                x5gVar.d = x5gVar.b.a(x5gVar.a, x5gVar.c.get(), true);
            }
            Object obj = x5gVar.d;
            obj.getClass();
            arrayList.set(i, new yy2(obj));
            return true;
        } catch (Throwable unused) {
            arrayList.set(i, z67.a);
            return false;
        }
    }
}
