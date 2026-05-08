package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.h;
import androidx.media3.extractor.text.SubtitleDecoderException;
import defpackage.e47;
import defpackage.yxe;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes.dex */
public final class ojf extends b implements Handler.Callback {
    public final o83 h0;
    public final DecoderInputBuffer i0;
    public r83 j0;
    public final yxe k0;
    public boolean l0;
    public int m0;
    public xxe n0;
    public aye o0;
    public bye p0;
    public bye q0;
    public int r0;
    public final Handler s0;
    public final d.a t0;
    public final ql0 u0;
    public boolean v0;
    public boolean w0;
    public a x0;
    public long y0;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojf(d.a aVar, Looper looper) {
        Handler handler;
        super(3);
        yxe.a aVar2 = yxe.a;
        this.t0 = aVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = vjg.a;
            handler = new Handler(looper, this);
        }
        this.s0 = handler;
        this.k0 = aVar2;
        this.h0 = new o83();
        this.i0 = new DecoderInputBuffer(1);
        this.u0 = new ql0();
        this.z0 = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        this.x0 = null;
        this.z0 = -9223372036854775807L;
        q83 q83Var = new q83(P(this.y0), qyc.e);
        Handler handler = this.s0;
        if (handler != null) {
            handler.obtainMessage(1, q83Var).sendToTarget();
        } else {
            d.a aVar = this.t0;
            int i = 2;
            d.this.m.f(27, new ob3(q83Var.a, i));
            d dVar = d.this;
            dVar.d0 = q83Var;
            dVar.m.f(27, new yy1(q83Var, i));
        }
        this.y0 = -9223372036854775807L;
        if (this.n0 != null) {
            R();
            xxe xxeVar = this.n0;
            xxeVar.getClass();
            xxeVar.release();
            this.n0 = null;
            this.m0 = 0;
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.y0 = j;
        r83 r83Var = this.j0;
        if (r83Var != null) {
            r83Var.clear();
        }
        q83 q83Var = new q83(P(this.y0), qyc.e);
        Handler handler = this.s0;
        if (handler != null) {
            handler.obtainMessage(1, q83Var).sendToTarget();
        } else {
            d.a aVar = this.t0;
            int i = 2;
            d.this.m.f(27, new ob3(q83Var.a, i));
            d dVar = d.this;
            dVar.d0 = q83Var;
            dVar.m.f(27, new yy1(q83Var, i));
        }
        this.v0 = false;
        this.w0 = false;
        this.z0 = -9223372036854775807L;
        a aVar2 = this.x0;
        if (aVar2 == null || Objects.equals(aVar2.n, "application/x-media3-cues")) {
            return;
        }
        if (this.m0 == 0) {
            R();
            xxe xxeVar = this.n0;
            xxeVar.getClass();
            xxeVar.flush();
            xxeVar.d(this.a0);
            return;
        }
        R();
        xxe xxeVar2 = this.n0;
        xxeVar2.getClass();
        xxeVar2.release();
        this.n0 = null;
        this.m0 = 0;
        Q();
    }

    @Override // androidx.media3.exoplayer.b
    public final void L(a[] aVarArr, long j, long j2, h.b bVar) {
        a aVar = aVarArr[0];
        this.x0 = aVar;
        if (Objects.equals(aVar.n, "application/x-media3-cues")) {
            this.j0 = this.x0.L == 1 ? new yo9() : new r7i(2);
            return;
        }
        N();
        if (this.n0 != null) {
            this.m0 = 1;
        } else {
            Q();
        }
    }

    @RequiresNonNull({"streamFormat"})
    public final void N() {
        ka2.p("Legacy decoding is disabled, can't handle " + this.x0.n + " samples (expected application/x-media3-cues).", Objects.equals(this.x0.n, "application/cea-608") || Objects.equals(this.x0.n, "application/x-mp4-cea-608") || Objects.equals(this.x0.n, "application/cea-708"));
    }

    public final long O() {
        if (this.r0 == -1) {
            return Long.MAX_VALUE;
        }
        this.p0.getClass();
        if (this.r0 >= this.p0.m()) {
            return Long.MAX_VALUE;
        }
        return this.p0.f(this.r0);
    }

    @SideEffectFree
    public final long P(long j) {
        ka2.q(j != -9223372036854775807L);
        return j - this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q() {
        /*
            r7 = this;
            r0 = 1
            r7.l0 = r0
            androidx.media3.common.a r1 = r7.x0
            r1.getClass()
            yxe r2 = r7.k0
            yxe$a r2 = (yxe.a) r2
            qq3 r2 = r2.b
            java.lang.String r3 = r1.n
            int r4 = r1.K
            if (r3 == 0) goto L4e
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L32;
                case 1566015601: goto L29;
                case 1566016562: goto L1e;
                default: goto L1c;
            }
        L1c:
            r0 = r6
            goto L3c
        L1e:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L27
            goto L1c
        L27:
            r0 = 2
            goto L3c
        L29:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3c
            goto L1c
        L32:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3b
            goto L1c
        L3b:
            r0 = 0
        L3c:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L48;
                case 2: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L4e
        L40:
            cz1 r0 = new cz1
            java.util.List<byte[]> r1 = r1.q
            r0.<init>(r4, r1)
            goto L6b
        L48:
            az1 r0 = new az1
            r0.<init>(r3, r4)
            goto L6b
        L4e:
            boolean r0 = r2.a(r1)
            if (r0 == 0) goto L73
            dye r0 = r2.c(r1)
            qt3 r1 = new qt3
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6b:
            r7.n0 = r0
            long r1 = r7.a0
            r0.d(r1)
            return
        L73:
            java.lang.String r7 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r7 = defpackage.l5.l(r7, r3)
            defpackage.l5.q(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojf.Q():void");
    }

    public final void R() {
        this.o0 = null;
        this.r0 = -1;
        bye byeVar = this.p0;
        if (byeVar != null) {
            byeVar.o();
            this.p0 = null;
        }
        bye byeVar2 = this.q0;
        if (byeVar2 != null) {
            byeVar2.o();
            this.q0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.l
    public final int a(a aVar) {
        boolean zEquals = Objects.equals(aVar.n, "application/x-media3-cues");
        String str = aVar.n;
        if (!zEquals) {
            yxe.a aVar2 = (yxe.a) this.k0;
            aVar2.getClass();
            if (!aVar2.b.a(aVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return st9.n(str) ? l.f(1, 0, 0, 0) : l.f(0, 0, 0, 0);
            }
        }
        return l.f(aVar.O == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        a aVar = this.x0;
        if (aVar != null) {
            if (!Objects.equals(aVar.n, "application/x-media3-cues")) {
                if (!this.w0) {
                    if (this.v0) {
                        bye byeVar = this.p0;
                        long j = this.y0;
                        if (byeVar == null || byeVar.m() <= 0 || byeVar.f(byeVar.m() - 1) <= j) {
                            bye byeVar2 = this.q0;
                            long j2 = this.y0;
                            if ((byeVar2 == null || byeVar2.m() <= 0 || byeVar2.f(byeVar2.m() - 1) <= j2) && this.o0 != null) {
                            }
                        }
                    }
                }
                return false;
            }
            r83 r83Var = this.j0;
            r83Var.getClass();
            if (r83Var.d(this.y0) == Long.MIN_VALUE) {
                try {
                    n();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean c() {
        return this.w0;
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            bg.h();
            return false;
        }
        q83 q83Var = (q83) message.obj;
        qyc qycVar = q83Var.a;
        d.a aVar = this.t0;
        int i = 2;
        d.this.m.f(27, new ob3(qycVar, i));
        d dVar = d.this;
        dVar.d0 = q83Var;
        dVar.m.f(27, new yy1(q83Var, i));
        return true;
    }

    @Override // androidx.media3.exoplayer.k
    public final void i(long j, long j2) {
        boolean z;
        ql0 ql0Var;
        boolean z2;
        long jF;
        if (this.c0) {
            long j3 = this.z0;
            if (j3 != -9223372036854775807L && j >= j3) {
                R();
                this.w0 = true;
            }
        }
        if (this.w0) {
            return;
        }
        a aVar = this.x0;
        aVar.getClass();
        boolean zEquals = Objects.equals(aVar.n, "application/x-media3-cues");
        int i = 2;
        d.a aVar2 = this.t0;
        Handler handler = this.s0;
        int i2 = 4;
        ql0 ql0Var2 = this.u0;
        boolean zA = false;
        zA = false;
        zA = false;
        if (zEquals) {
            this.j0.getClass();
            if (!this.v0) {
                DecoderInputBuffer decoderInputBuffer = this.i0;
                if (M(ql0Var2, decoderInputBuffer, 0) == -4) {
                    if (decoderInputBuffer.h(4)) {
                        this.v0 = true;
                    } else {
                        decoderInputBuffer.r();
                        ByteBuffer byteBuffer = decoderInputBuffer.d;
                        byteBuffer.getClass();
                        long j4 = decoderInputBuffer.f;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.h0.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        e47.b bVar = e47.b;
                        e47.a aVar3 = new e47.a();
                        for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                            bundle2.getClass();
                            aVar3.c(n83.b(bundle2));
                        }
                        s83 s83Var = new s83(j4, bundle.getLong("d"), aVar3.f());
                        decoderInputBuffer.n();
                        zA = this.j0.a(s83Var, j);
                    }
                }
            }
            long jD = this.j0.d(this.y0);
            if (jD == Long.MIN_VALUE && this.v0 && !zA) {
                this.w0 = true;
            }
            if (jD != Long.MIN_VALUE && jD <= j) {
                zA = true;
            }
            if (zA) {
                e47<n83> e47VarB = this.j0.b(j);
                long jC = this.j0.c(j);
                q83 q83Var = new q83(P(jC), e47VarB);
                if (handler != null) {
                    handler.obtainMessage(1, q83Var).sendToTarget();
                } else {
                    d.this.m.f(27, new ob3(q83Var.a, i));
                    d dVar = d.this;
                    dVar.d0 = q83Var;
                    dVar.m.f(27, new yy1(q83Var, i));
                }
                this.j0.e(jC);
            }
            this.y0 = j;
            return;
        }
        N();
        this.y0 = j;
        if (this.q0 == null) {
            xxe xxeVar = this.n0;
            xxeVar.getClass();
            xxeVar.a(j);
            try {
                xxe xxeVar2 = this.n0;
                xxeVar2.getClass();
                this.q0 = xxeVar2.b();
            } catch (SubtitleDecoderException e) {
                zkd.x("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.x0, e);
                q83 q83Var2 = new q83(P(this.y0), qyc.e);
                if (handler != null) {
                    handler.obtainMessage(1, q83Var2).sendToTarget();
                } else {
                    d.this.m.f(27, new ob3(q83Var2.a, i));
                    d dVar2 = d.this;
                    dVar2.d0 = q83Var2;
                    dVar2.m.f(27, new yy1(q83Var2, i));
                }
                R();
                xxe xxeVar3 = this.n0;
                xxeVar3.getClass();
                xxeVar3.release();
                this.n0 = null;
                this.m0 = 0;
                Q();
                return;
            }
        }
        if (this.W != 2) {
            return;
        }
        if (this.p0 != null) {
            long jO = O();
            z = false;
            while (jO <= j) {
                this.r0++;
                jO = O();
                z = true;
            }
        } else {
            z = false;
        }
        bye byeVar = this.q0;
        if (byeVar == null) {
            ql0Var = ql0Var2;
            z2 = z;
        } else if (byeVar.h(4)) {
            if (!z && O() == Long.MAX_VALUE) {
                if (this.m0 == 2) {
                    R();
                    xxe xxeVar4 = this.n0;
                    xxeVar4.getClass();
                    xxeVar4.release();
                    this.n0 = null;
                    this.m0 = 0;
                    Q();
                } else {
                    R();
                    this.w0 = true;
                }
            }
            ql0Var = ql0Var2;
            z2 = z;
        } else {
            ql0Var = ql0Var2;
            z2 = z;
            if (byeVar.b <= j) {
                bye byeVar2 = this.p0;
                if (byeVar2 != null) {
                    byeVar2.o();
                }
                this.r0 = byeVar.a(j);
                this.p0 = byeVar;
                this.q0 = null;
                z2 = true;
            }
        }
        if (z2) {
            this.p0.getClass();
            int iA = this.p0.a(j);
            if (iA == 0 || this.p0.m() == 0) {
                jF = this.p0.b;
            } else {
                bye byeVar3 = this.p0;
                jF = iA == -1 ? byeVar3.f(byeVar3.m() - 1) : byeVar3.f(iA - 1);
            }
            q83 q83Var3 = new q83(P(jF), this.p0.e(j));
            if (handler != null) {
                handler.obtainMessage(1, q83Var3).sendToTarget();
            } else {
                d.this.m.f(27, new ob3(q83Var3.a, i));
                d dVar3 = d.this;
                dVar3.d0 = q83Var3;
                dVar3.m.f(27, new yy1(q83Var3, i));
            }
        }
        if (this.m0 == 2) {
            return;
        }
        while (!this.v0) {
            try {
                aye ayeVarE = this.o0;
                if (ayeVarE == null) {
                    xxe xxeVar5 = this.n0;
                    xxeVar5.getClass();
                    ayeVarE = xxeVar5.e();
                    if (ayeVarE == null) {
                        return;
                    } else {
                        this.o0 = ayeVarE;
                    }
                }
                if (this.m0 == 1) {
                    ayeVarE.a = i2;
                    xxe xxeVar6 = this.n0;
                    xxeVar6.getClass();
                    xxeVar6.c(ayeVarE);
                    this.o0 = null;
                    this.m0 = 2;
                    return;
                }
                ql0 ql0Var3 = ql0Var;
                int iM = M(ql0Var3, ayeVarE, 0);
                if (iM == -4) {
                    if (ayeVarE.h(i2)) {
                        this.v0 = true;
                        this.l0 = false;
                    } else {
                        a aVar4 = (a) ql0Var3.c;
                        if (aVar4 == null) {
                            return;
                        }
                        ayeVarE.X = aVar4.s;
                        ayeVarE.r();
                        this.l0 &= !ayeVarE.h(1);
                    }
                    if (!this.l0) {
                        xxe xxeVar7 = this.n0;
                        xxeVar7.getClass();
                        xxeVar7.c(ayeVarE);
                        this.o0 = null;
                    }
                } else if (iM == -3) {
                    return;
                }
                ql0Var = ql0Var3;
                i2 = 4;
            } catch (SubtitleDecoderException e2) {
                zkd.x("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.x0, e2);
                q83 q83Var4 = new q83(P(this.y0), qyc.e);
                if (handler != null) {
                    handler.obtainMessage(1, q83Var4).sendToTarget();
                } else {
                    d.this.m.f(27, new ob3(q83Var4.a, i));
                    d dVar4 = d.this;
                    dVar4.d0 = q83Var4;
                    dVar4.m.f(27, new yy1(q83Var4, i));
                }
                R();
                xxe xxeVar8 = this.n0;
                xxeVar8.getClass();
                xxeVar8.release();
                this.n0 = null;
                this.m0 = 0;
                Q();
                return;
            }
        }
    }
}
