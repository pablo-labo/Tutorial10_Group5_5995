package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wgf {

    public static final class a implements toa {
        public final /* synthetic */ rgf a;
        public final /* synthetic */ boolean b;

        public a(rgf rgfVar, boolean z) {
            this.a = rgfVar;
            this.b = z;
        }

        @Override // defpackage.toa
        public final long a() {
            return this.a.k(this.b);
        }
    }

    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ udf a;

        public b(udf udfVar) {
            this.a = udfVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objA = n59.a(efbVar, this.a, lu2Var);
            return objA == g13.a ? objA : j6g.a;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jf6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final boolean z, final b5d b5dVar, final rgf rgfVar, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        nif nifVarD;
        mif mifVar;
        androidx.compose.runtime.c cVarH = bVar.h(-1344558920);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(b5dVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(rgfVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zK = (i3 == 4) | cVarH.K(rgfVar);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new pgf(rgfVar, z);
                cVarH.p(objV);
            }
            udf udfVar = (udf) objV;
            boolean zX = cVarH.x(rgfVar) | (i3 == 4);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new a(rgfVar, z);
                cVarH.p(objV2);
            }
            toa toaVar = (toa) objV2;
            boolean zG = kjf.g(rgfVar.m().b);
            int i4 = (int) (z ? rgfVar.m().b >> 32 : rgfVar.m().b & 4294967295L);
            lu8 lu8Var = rgfVar.d;
            float fA = (lu8Var == null || (nifVarD = lu8Var.d()) == null || (mifVar = nifVarD.a) == null) ? 0.0f : jif.a(mifVar, i4);
            boolean zX2 = cVarH.x(udfVar);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new b(udfVar);
                cVarH.p(objV3);
            }
            y90.b(toaVar, z, b5dVar, zG, 0L, fA, f1f.b(e.a.b, udfVar, (PointerInputEventHandler) objV3), cVarH, (i2 << 3) & 1008);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: vgf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    wgf.a(z, b5dVar, rgfVar, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final boolean b(rgf rgfVar, boolean z) {
        sl8 sl8VarC;
        lu8 lu8Var = rgfVar.d;
        if (lu8Var == null || (sl8VarC = lu8Var.c()) == null) {
            return false;
        }
        return k4e.a(k4e.c(sl8VarC), rgfVar.k(z));
    }
}
