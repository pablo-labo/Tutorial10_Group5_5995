package defpackage;

import defpackage.cud;
import defpackage.d36;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class tga implements qsc, xh8 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public static final class a extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tga tgaVar) {
            super(0);
            this.$this_inject = tgaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<cy3> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tga tgaVar) {
            super(0);
            this.$this_inject = tgaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [cy3, java.lang.Object] */
        @Override // defpackage.gu5
        public final cy3 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(cy3.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tga tgaVar) {
            super(0);
            this.$this_inject = tgaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public tga() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.b = boa.E(qt8Var, new b(this));
        this.c = boa.E(qt8Var, new c(this));
    }

    public static final ArrayList c(tga tgaVar, List list) {
        tgaVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        cy3 cy3Var = (cy3) tgaVar.b.getValue();
        String strA = bu8.a.a();
        if (strA == null) {
            strA = "";
        }
        cy3Var.getClass();
        ArrayList arrayListB = cy3Var.a.y().b(strA);
        List<d36.e> list2 = list;
        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
        for (d36.e eVar : list2) {
            String str = eVar.a;
            d36.a aVar = eVar.c;
            String str2 = aVar.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = aVar.b;
            if (str3 == null) {
                str3 = "";
            }
            arrayList2.add(new lsc(str, new jud(str2, str3), ((Long) eVar.b).longValue(), (Integer) null, 24));
        }
        List listP1 = z92.p1(arrayList2, new f72(2));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i = 0;
        int i2 = 0;
        while (i < listP1.size() && linkedHashSet.size() < 10) {
            xx3 xx3Var = (xx3) z92.R0(i2, arrayListB);
            int i3 = i + 1;
            lsc lscVar = (lsc) listP1.get(i);
            if (xx3Var != null && lscVar.c <= xx3Var.f) {
                linkedHashSet2.add(new jud(xx3Var.c, xx3Var.d));
                i2++;
            }
            jud judVar = lscVar.b;
            if (!linkedHashSet.contains(judVar) && !linkedHashSet2.contains(judVar)) {
                arrayList.add(lscVar);
                linkedHashSet.add(judVar);
            }
            i = i3;
        }
        return arrayList;
    }

    @Override // defpackage.qsc
    public final Object a(fud fudVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new sga(this, null), fudVar);
    }

    @Override // defpackage.qsc
    public final Object b(lsc lscVar, cud.a aVar) throws Throwable {
        eq3 eq3Var = a74.a;
        Object objQ0 = u63.q0(no3.c, new rga(this, lscVar, null), aVar);
        return objQ0 == g13.a ? objQ0 : j6g.a;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
