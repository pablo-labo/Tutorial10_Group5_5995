package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.yoga.YogaNodeJNIBase;
import com.indeed.android.jobsearch.R;
import e4g.u;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gpc extends rjc implements l6h {
    public int P0;
    public EditText Q0;
    public cpc R0;
    public String S0;
    public String T0;

    public gpc(ppc ppcVar) {
        super(ppcVar);
        this.P0 = -1;
        this.y0 = 1;
        this.j0.Y(this);
    }

    @Override // defpackage.l6h
    public final long N(YogaNodeJNIBase yogaNodeJNIBase, float f, m6h m6hVar, float f2, m6h m6hVar2) {
        EditText editText = this.Q0;
        if (editText == null) {
            r6.g("Required value was null.");
            return 0L;
        }
        cpc cpcVar = this.R0;
        if (cpcVar != null) {
            editText.setText(cpcVar.a);
            editText.setTextSize(0, cpcVar.b);
            editText.setMinLines(cpcVar.c);
            editText.setMaxLines(cpcVar.d);
            editText.setInputType(cpcVar.e);
            editText.setHint(cpcVar.g);
            editText.setBreakStrategy(cpcVar.f);
        } else {
            editText.setTextSize(0, this.p0.a());
            int i = this.w0;
            if (i != -1) {
                editText.setLines(i);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i2 = this.y0;
            if (breakStrategy != i2) {
                editText.setBreakStrategy(i2);
            }
        }
        editText.setHint(this.T0);
        editText.measure(fg9.a(f, m6hVar), fg9.a(f2, m6hVar2));
        return wtf.e(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // defpackage.loc
    public final boolean a0() {
        return true;
    }

    @Override // defpackage.loc
    public final void c0(e4g e4gVar) {
        e4gVar.getClass();
        if (this.P0 != -1) {
            npc npcVar = new npc(n0(this, this.S0, false, null), this.P0, this.N0, X(0), X(1), X(2), X(3), this.x0, this.y0, this.z0);
            e4gVar.h.add(e4gVar.new u(this.a, npcVar));
        }
    }

    @Override // defpackage.loc, defpackage.koc
    public final void k(mkf mkfVar) {
        mkfVar.getClass();
        this.d = mkfVar;
        mkf mkfVar2 = this.d;
        hh1.n(mkfVar2);
        EditText editText = new EditText(new fu2(mkfVar2, R.style.Theme_ReactNative_TextInput_DefaultBackground));
        WeakHashMap<View, prg> weakHashMap = epg.a;
        float paddingStart = editText.getPaddingStart();
        coe coeVar = this.g0;
        coeVar.b(paddingStart, 4);
        k0();
        coeVar.b(editText.getPaddingTop(), 1);
        k0();
        coeVar.b(editText.getPaddingEnd(), 5);
        k0();
        coeVar.b(editText.getPaddingBottom(), 3);
        k0();
        this.Q0 = editText;
        editText.setPadding(0, 0, 0, 0);
        EditText editText2 = this.Q0;
        if (editText2 != null) {
            editText2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
    }

    @Override // defpackage.loc, defpackage.koc
    public final void m(Object obj) {
        obj.getClass();
        hh1.l(obj instanceof cpc);
        this.R0 = (cpc) obj;
        w();
    }

    @Override // defpackage.loc, defpackage.koc
    public final void r(float f, int i) {
        super.r(f, i);
        b0();
    }

    @snc(name = "mostRecentEventCount")
    public final void setMostRecentEventCount(int i) {
        this.P0 = i;
    }

    @snc(name = "placeholder")
    public final void setPlaceholder(String str) {
        this.T0 = str;
        b0();
    }

    @snc(name = "text")
    public final void setText(String str) {
        this.S0 = str;
        b0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r4.equals("simple") == false) goto L21;
     */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextBreakStrategy(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L47
            int r1 = r4.hashCode()
            r2 = -1924829944(0xffffffff8d456d08, float:-6.0836553E-31)
            if (r1 == r2) goto L2d
            r2 = -902286926(0xffffffffca3831b2, float:-3017836.5)
            if (r1 == r2) goto L24
            r2 = 336871677(0x141440fd, float:7.484907E-27)
            if (r1 == r2) goto L17
            goto L35
        L17:
            java.lang.String r1 = "highQuality"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L20
            goto L35
        L20:
            r4 = 1
            r3.y0 = r4
            return
        L24:
            java.lang.String r1 = "simple"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L47
            goto L35
        L2d:
            java.lang.String r1 = "balanced"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L43
        L35:
            java.lang.String r1 = "Invalid textBreakStrategy: "
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r1 = "ReactNative"
            defpackage.s55.n(r1, r4)
            r3.y0 = r0
            return
        L43:
            r4 = 2
            r3.y0 = r4
            return
        L47:
            r3.y0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpc.setTextBreakStrategy(java.lang.String):void");
    }

    public gpc() {
        this(null);
    }
}
