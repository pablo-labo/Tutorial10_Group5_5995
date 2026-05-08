package defpackage;

import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.le0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ne0 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;
        final /* synthetic */ le0.b $this_appendAutoLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(le0.b bVar, String str, y yVar, int i) {
            super(2);
            this.$this_appendAutoLink = bVar;
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ne0.a(this.$this_appendAutoLink, this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;
        final /* synthetic */ le0.b $this_appendMarkdownLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(le0.b bVar, String str, y yVar, int i) {
            super(2);
            this.$this_appendMarkdownLink = bVar;
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ne0.b(this.$this_appendMarkdownLink, this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;
        final /* synthetic */ le0.b $this_appendMarkdownLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(le0.b bVar, String str, y yVar, int i) {
            super(2);
            this.$this_appendMarkdownLink = bVar;
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ne0.b(this.$this_appendMarkdownLink, this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;
        final /* synthetic */ le0.b $this_buildMarkdownAnnotatedString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(le0.b bVar, String str, y yVar, int i) {
            super(2);
            this.$this_buildMarkdownAnnotatedString = bVar;
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ne0.c(this.$this_buildMarkdownAnnotatedString, this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ List<y> $children;
        final /* synthetic */ String $content;
        final /* synthetic */ le0.b $this_buildMarkdownAnnotatedString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(le0.b bVar, String str, List<? extends y> list, int i) {
            super(2);
            this.$this_buildMarkdownAnnotatedString = bVar;
            this.$content = str;
            this.$children = list;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ne0.d(this.$this_buildMarkdownAnnotatedString, this.$content, this.$children, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(le0.b bVar, String str, y yVar, androidx.compose.runtime.b bVar2, int i) {
        int i2;
        Object next;
        bVar.getClass();
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar2.h(1208806019);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(bVar) : cVarH.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(yVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else {
            Iterator<T> it = yVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((y) next).getType().a.equals(pg8.l0.a)) {
                        break;
                    }
                }
            }
            y yVar2 = (y) next;
            if (yVar2 == null) {
                yVar2 = yVar;
            }
            String string = boa.w(yVar2, str).toString();
            bVar.j("MARKDOWN_URL", string);
            bVar.k(new foe(((cd9) cVarH.M(rk2.d)).f(), 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61434));
            bVar.g(string);
            bVar.h();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(bVar, str, yVar, i);
        }
    }

    public static final void b(le0.b bVar, String str, y yVar, androidx.compose.runtime.b bVar2, int i) {
        int i2;
        CharSequence charSequenceW;
        CharSequence charSequenceW2;
        List<y> listA;
        bVar.getClass();
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar2.h(1438595267);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(bVar) : cVarH.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(yVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else {
            y yVarR = boa.r(yVar, pg8.g0);
            String string = null;
            List<y> listSubList = (yVarR == null || (listA = yVarR.a()) == null) ? null : listA.subList(1, listA.size() - 1);
            if (listSubList == null) {
                bVar.g(boa.w(yVar, str).toString());
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new b(bVar, str, yVar, i);
                    return;
                }
                return;
            }
            y yVarR2 = boa.r(yVar, pg8.e0);
            String string2 = (yVarR2 == null || (charSequenceW2 = boa.w(yVarR2, str)) == null) ? null : charSequenceW2.toString();
            y yVarR3 = boa.r(yVar, pg8.d0);
            if (yVarR3 != null && (charSequenceW = boa.w(yVarR3, str)) != null) {
                string = charSequenceW.toString();
            }
            if (string2 == null) {
                string2 = string;
            }
            if (string2 != null) {
                bVar.j("MARKDOWN_URL", string2);
            }
            bVar.k(new foe(((cd9) cVarH.M(rk2.d)).f(), 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61434));
            d(bVar, str, listSubList, cVarH, (i2 & 112) | (i2 & 14) | 8);
            bVar.h();
            if (string2 != null) {
                bVar.h();
            }
        }
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new c(bVar, str, yVar, i);
        }
    }

    public static final void c(le0.b bVar, String str, y yVar, androidx.compose.runtime.b bVar2, int i) {
        int i2;
        bVar.getClass();
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar2.h(-1994614502);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(bVar) : cVarH.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(yVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else {
            d(bVar, str, yVar.a(), cVarH, (i2 & 112) | (i2 & 14) | 8);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d(bVar, str, yVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(le0.b r39, java.lang.String r40, java.util.List<? extends defpackage.y> r41, androidx.compose.runtime.b r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne0.d(le0$b, java.lang.String, java.util.List, androidx.compose.runtime.b, int):void");
    }
}
