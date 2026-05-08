package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class aff implements zu5<Float, da2, da2, Float, b, Integer, j6g> {
    public final /* synthetic */ Function2<b, Integer, j6g> V;
    public final /* synthetic */ Function2<b, Integer, j6g> W;
    public final /* synthetic */ dce X;
    public final /* synthetic */ ihf Y;
    public final /* synthetic */ Function2<b, Integer, j6g> Z;
    public final /* synthetic */ Function2<b, Integer, j6g> a;
    public final /* synthetic */ gza a0;
    public final /* synthetic */ Function2<b, Integer, j6g> b;
    public final /* synthetic */ boolean b0;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function2<b, Integer, j6g> c0;
    public final /* synthetic */ ar3 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ei7 f;

    public aff(Function2 function2, Function2 function22, String str, ar3 ar3Var, boolean z, ei7 ei7Var, Function2 function23, Function2 function24, dce dceVar, ihf ihfVar, Function2 function25, gza gzaVar, boolean z2, Function2 function26) {
        this.a = function2;
        this.b = function22;
        this.c = str;
        this.d = ar3Var;
        this.e = z;
        this.f = ei7Var;
        this.V = function23;
        this.W = function24;
        this.X = dceVar;
        this.Y = ihfVar;
        this.Z = function25;
        this.a0 = gzaVar;
        this.b0 = z2;
        this.c0 = function26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zu5
    public final j6g m(Float f, da2 da2Var, da2 da2Var2, Float f2, b bVar, Integer num) {
        int i;
        final float f3;
        ah2 ah2Var;
        ah2 ah2VarC;
        ah2 ah2VarC2;
        ah2 ah2Var2;
        float fFloatValue = f.floatValue();
        long j = da2Var.a;
        long j2 = da2Var2.a;
        float fFloatValue2 = f2.floatValue();
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i = (bVar2.c(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= bVar2.e(j) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= bVar2.e(j2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((iIntValue & 3072) == 0) {
            i |= bVar2.c(fFloatValue2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i2 = i;
        if (bVar2.o(i2 & 1, (i2 & 9363) != 9362)) {
            Function2<b, Integer, j6g> function2 = this.a;
            if (function2 == null) {
                bVar2.L(986681709);
                bVar2.F();
                f3 = fFloatValue;
                ah2Var = null;
            } else {
                bVar2.L(986681710);
                f3 = fFloatValue;
                ah2 ah2VarC3 = bh2.c(723429411, new sef(f3, j2, function2, this.b0, j), bVar2);
                bVar2.F();
                ah2Var = ah2VarC3;
            }
            boolean z = this.e;
            ar3 ar3Var = this.d;
            Function2<b, Integer, j6g> function22 = this.b;
            if (function22 == null || this.c.length() != 0 || fFloatValue2 <= 0.0f) {
                bVar2.L(988093542);
                bVar2.F();
                ah2VarC = null;
            } else {
                bVar2.L(987666549);
                ah2VarC = bh2.c(-426706263, new vef(fFloatValue2, ar3Var, z, function22), bVar2);
                bVar2.F();
            }
            bVar2.L(-1519634405);
            g4a g4aVarG = r.g(new da2(!z ? ar3Var.j : ar3Var.i), bVar2);
            bVar2.F();
            long j3 = ((da2) g4aVarG.getValue()).a;
            Function2<b, Integer, j6g> function23 = this.V;
            if (function23 == null) {
                bVar2.L(988282301);
                bVar2.F();
                ah2VarC2 = null;
            } else {
                bVar2.L(988282302);
                ah2VarC2 = bh2.c(-317090443, new tef(j3, function23), bVar2);
                bVar2.F();
            }
            bVar2.L(1383318157);
            g4a g4aVarG2 = r.g(new da2(!z ? ar3Var.m : ar3Var.l), bVar2);
            bVar2.F();
            long j4 = ((da2) g4aVarG2.getValue()).a;
            Function2<b, Integer, j6g> function24 = this.W;
            if (function24 == null) {
                bVar2.L(988575964);
                bVar2.F();
                ah2Var2 = null;
            } else {
                bVar2.L(988575965);
                ah2 ah2VarC4 = bh2.c(262889693, new yef(j4, function24), bVar2);
                bVar2.F();
                ah2Var2 = ah2VarC4;
            }
            bVar2.L(-1423938813);
            g4a g4aVarG3 = r.g(new da2(ar3Var.o), bVar2);
            bVar2.F();
            e eVarB = a.b(e.a.b, ((da2) g4aVarG3.getValue()).a, this.X);
            int iOrdinal = this.Y.ordinal();
            if (iOrdinal == 0) {
                bVar2.L(988856360);
                zff.b(eVarB, this.Z, ah2Var, ah2VarC, ah2VarC2, ah2Var2, f3, this.a0, bVar2, (i2 << 21) & 29360128);
                bVar2.F();
            } else {
                if (iOrdinal != 1) {
                    bVar2.L(1971561250);
                    bVar2.F();
                    l.g();
                    return null;
                }
                bVar2.L(989436742);
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (objV == c0020a) {
                    objV = r.f(new kie(0L));
                    bVar2.p(objV);
                }
                final g4a g4aVar = (g4a) objV;
                ah2 ah2VarC5 = bh2.c(-1107746014, new zef(g4aVar, this.a0, this.c0), bVar2);
                boolean z2 = (i2 & 14) == 4;
                Object objV2 = bVar2.v();
                if (z2 || objV2 == c0020a) {
                    objV2 = new Function1() { // from class: pef
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            kie kieVar = (kie) obj;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (kieVar.a >> 32));
                            float f4 = f3;
                            float f5 = fIntBitsToFloat * f4;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (kieVar.a & 4294967295L)) * f4;
                            g4a g4aVar2 = g4aVar;
                            if (Float.intBitsToFloat((int) (((kie) g4aVar2.getValue()).a >> 32)) != f5 || Float.intBitsToFloat((int) (((kie) g4aVar2.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                                g4aVar2.setValue(new kie((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                            }
                            return j6g.a;
                        }
                    };
                    bVar2.p(objV2);
                }
                ywa.b(eVarB, this.Z, ah2VarC, ah2Var, ah2VarC2, ah2Var2, f3, (Function1) objV2, ah2VarC5, this.a0, bVar2, ((i2 << 21) & 29360128) | 805306368);
                bVar2.F();
            }
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
