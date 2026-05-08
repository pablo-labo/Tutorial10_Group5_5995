package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class ia8 extends v1 {
    public final eve b;
    public final v1 c;

    public ia8(eve eveVar, s98 s98Var) {
        s98Var.getClass();
        this.b = eveVar;
        this.c = s98Var.b;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final byte H() {
        uzf uzfVar;
        eve eveVar = this.b;
        String strJ = eveVar.j();
        try {
            strJ.getClass();
            f4g f4gVarJ = jh2.J(strJ);
            if (f4gVarJ != null) {
                int i = f4gVarJ.a;
                uzfVar = Integer.compareUnsigned(i, 255) > 0 ? null : new uzf((byte) i);
            }
            if (uzfVar != null) {
                return uzfVar.a;
            }
            vve.z(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            eve.m(eveVar, ja.f('\'', "Failed to parse type 'UByte' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ul2
    public final v1 a() {
        return this.c;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final int k() {
        eve eveVar = this.b;
        String strJ = eveVar.j();
        try {
            strJ.getClass();
            f4g f4gVarJ = jh2.J(strJ);
            if (f4gVarJ != null) {
                return f4gVarJ.a;
            }
            vve.z(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            eve.m(eveVar, ja.f('\'', "Failed to parse type 'UInt' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final long n() {
        eve eveVar = this.b;
        String strJ = eveVar.j();
        try {
            strJ.getClass();
            l4g l4gVarK = jh2.K(strJ);
            if (l4gVarK != null) {
                return l4gVarK.a;
            }
            vve.z(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            eve.m(eveVar, ja.f('\'', "Failed to parse type 'ULong' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ul2
    public final int p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final short t() {
        u4g u4gVar;
        eve eveVar = this.b;
        String strJ = eveVar.j();
        try {
            strJ.getClass();
            f4g f4gVarJ = jh2.J(strJ);
            if (f4gVarJ != null) {
                int i = f4gVarJ.a;
                u4gVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new u4g((short) i);
            }
            if (u4gVar != null) {
                return u4gVar.a;
            }
            vve.z(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            eve.m(eveVar, ja.f('\'', "Failed to parse type 'UShort' for input '", strJ), 0, null, 6);
            throw null;
        }
    }
}
