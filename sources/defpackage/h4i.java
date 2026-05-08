package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzjy;
import defpackage.a5i;
import defpackage.n4i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h4i<FieldDescriptorType extends n4i<FieldDescriptorType>> {
    public static final h4i d = new h4i(0);
    public final mbi a;
    public boolean b;
    public boolean c;

    public h4i(int i) {
        this.c = false;
        mbi mbiVar = new mbi(0);
        this.a = mbiVar;
        if (this.b) {
            return;
        }
        mbiVar.g();
        this.b = true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.rei r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = defpackage.p5i.a
            r3.getClass()
            int[] r0 = defpackage.q4i.a
            zei r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L20;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            goto L47
        L17:
            boolean r2 = r3 instanceof defpackage.x8i
            if (r2 != 0) goto L2a
            boolean r2 = r3 instanceof defpackage.b6i
            if (r2 == 0) goto L29
            goto L2a
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L2a
            boolean r2 = r3 instanceof defpackage.n5i
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            r1 = r0
            goto L47
        L2c:
            boolean r2 = r3 instanceof defpackage.h0i
            if (r2 != 0) goto L2a
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L29
            goto L2a
        L35:
            boolean r0 = r3 instanceof java.lang.String
            goto L2a
        L38:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L2a
        L3b:
            boolean r0 = r3 instanceof java.lang.Double
            goto L2a
        L3e:
            boolean r0 = r3 instanceof java.lang.Float
            goto L2a
        L41:
            boolean r0 = r3 instanceof java.lang.Long
            goto L2a
        L44:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L2a
        L47:
            if (r1 == 0) goto L4a
            return
        L4a:
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            defpackage.l5.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4i.c(rei, java.lang.Object):void");
    }

    public static boolean d(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.l() == zei.MESSAGE) {
            if (key.i()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((x8i) it.next()).d()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof x8i)) {
                    if (value instanceof b6i) {
                        return true;
                    }
                    l5.q("Wrong object type used with protocol message reflection.");
                    return false;
                }
                if (!((x8i) value).d()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object f(Object obj) {
        if (obj instanceof f9i) {
            return ((f9i) obj).n1();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            mbi mbiVar = this.a;
            if (i >= mbiVar.b.size()) {
                Iterator it = mbiVar.h().iterator();
                while (it.hasNext()) {
                    if (!d((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!d(mbiVar.d(i))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final void b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.i()) {
            c(fielddescriptortype.k(), obj);
        } else {
            if (!(obj instanceof List)) {
                l5.q("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                c(fielddescriptortype.k(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof b6i) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        mbi mbiVar;
        h4i h4iVar = new h4i();
        int i = 0;
        while (true) {
            mbiVar = this.a;
            if (i >= mbiVar.b.size()) {
                break;
            }
            Map.Entry entryD = mbiVar.d(i);
            h4iVar.b((n4i) entryD.getKey(), entryD.getValue());
            i++;
        }
        for (Map.Entry entry : mbiVar.h()) {
            h4iVar.b((n4i) entry.getKey(), entry.getValue());
        }
        h4iVar.c = this.c;
        return h4iVar;
    }

    public final void e(Map.Entry<FieldDescriptorType, Object> entry) {
        a9i a9iVarH;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b6i) {
            int i = b6i.b;
            throw new NoSuchMethodError();
        }
        boolean zI = key.i();
        mbi mbiVar = this.a;
        if (zI) {
            Object arrayList = mbiVar.get(key);
            if (arrayList instanceof b6i) {
                int i2 = b6i.b;
                throw new NoSuchMethodError();
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) arrayList).add(f(it.next()));
            }
            mbiVar.put(key, arrayList);
            return;
        }
        if (key.l() != zei.MESSAGE) {
            mbiVar.put(key, f(value));
            return;
        }
        Object obj = mbiVar.get(key);
        if (obj instanceof b6i) {
            int i3 = b6i.b;
            throw new NoSuchMethodError();
        }
        if (obj == null) {
            mbiVar.put(key, f(value));
            return;
        }
        if (obj instanceof f9i) {
            a9iVarH = key.zza();
        } else {
            ((x8i) obj).f();
            a9iVarH = ((a5i.b) key.m36zza()).h();
            if (!a9iVarH.d()) {
                throw new zzjy();
            }
        }
        mbiVar.put(key, a9iVarH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4i) {
            return this.a.equals(((h4i) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public h4i() {
        this.c = false;
        this.a = new mbi(16);
    }
}
