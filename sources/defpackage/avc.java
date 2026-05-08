package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class avc extends yuc implements gu7 {
    public final Object[] b;

    public avc(n8a n8aVar, Object[] objArr) {
        super(n8aVar);
        this.b = objArr;
    }

    public final ArrayList c() {
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List<yd8<? extends Object>> list = wuc.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new nvc(null, (Enum) obj) : obj instanceof Annotation ? new zuc(null, (Annotation) obj) : obj instanceof Object[] ? new avc(null, (Object[]) obj) : obj instanceof Class ? new jvc(null, (Class) obj) : new pvc(null, obj));
        }
        return arrayList;
    }
}
