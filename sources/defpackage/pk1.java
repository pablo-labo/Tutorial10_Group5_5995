package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@s.b("bottomSheet")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\b²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lpk1;", "Landroidx/navigation/s;", "Lpk1$a;", "a", "", "Landroidx/navigation/d;", "transitionsInProgressEntries", "retainedEntry", "material-navigation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class pk1 extends s<a> {
    public final hw9 c;
    public final g4a d = r.f(Boolean.FALSE);
    public final ah2 e = new ah2(-1433084388, new b(), true);

    public static final class a extends k implements ui5 {
        public final ah2 a0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pk1 pk1Var) {
            super(pk1Var);
            ah2 ah2Var = oh2.a;
            this.a0 = ah2Var;
        }
    }

    public static final class b extends mj8 implements wu5<pb2, androidx.compose.runtime.b, Integer, j6g> {
        public b() {
            super(3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wu5
        public final j6g q(pb2 pb2Var, androidx.compose.runtime.b bVar, Integer num) {
            pb2 pb2Var2 = pb2Var;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.K(pb2Var2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && bVar2.i()) {
                bVar2.D();
            } else {
                hkd hkdVarY = r03.y(bVar2);
                pk1 pk1Var = pk1.this;
                g4a g4aVarA = r.a(((Boolean) ((gme) pk1Var.d).getValue()).booleanValue() ? pk1Var.b().f : hh2.e(is4.a), bVar2);
                pk1 pk1Var2 = pk1.this;
                Object objE = ((Boolean) ((gme) pk1Var2.d).getValue()).booleanValue() ? pk1Var2.b().e : hh2.e(zr4.a);
                boolean zX = bVar2.x(pk1.this);
                pk1 pk1Var3 = pk1.this;
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new uk1(pk1Var3, null);
                    bVar2.p(objV);
                }
                Function2 function2 = (Function2) objV;
                Object objV2 = bVar2.v();
                if (objV2 == c0020a) {
                    objV2 = r.f(null);
                    bVar2.p(objV2);
                }
                g4a g4aVar = (g4a) objV2;
                boolean zX2 = bVar2.x(function2);
                Object objV3 = bVar2.v();
                if (zX2 || objV3 == c0020a) {
                    objV3 = new kme(function2, g4aVar, null);
                    bVar2.p(objV3);
                }
                to4.d(bVar2, objE, (Function2) objV3);
                if (((d) g4aVar.getValue()) != null) {
                    bVar2.L(1881932140);
                    d dVar = (d) g4aVar.getValue();
                    boolean zX3 = bVar2.x(pk1.this);
                    pk1 pk1Var4 = pk1.this;
                    Object objV4 = bVar2.v();
                    if (zX3 || objV4 == c0020a) {
                        objV4 = new qk1(pk1Var4, null);
                        bVar2.p(objV4);
                    }
                    to4.d(bVar2, dVar, (Function2) objV4);
                    boolean zX4 = bVar2.x(pk1.this) | bVar2.K(g4aVar);
                    pk1 pk1Var5 = pk1.this;
                    Object objV5 = bVar2.v();
                    if (zX4 || objV5 == c0020a) {
                        objV5 = new rk1(pk1Var5, g4aVar);
                        bVar2.p(objV5);
                    }
                    g71.a(false, (gu5) objV5, bVar2, 0, 1);
                    bVar2.F();
                } else {
                    bVar2.L(1882153170);
                    bVar2.F();
                }
                d dVar2 = (d) g4aVar.getValue();
                hw9 hw9Var = pk1.this.c;
                boolean zK = bVar2.K(g4aVarA) | bVar2.x(pk1.this);
                pk1 pk1Var6 = pk1.this;
                Object objV6 = bVar2.v();
                if (zK || objV6 == c0020a) {
                    objV6 = new sk1(pk1Var6, g4aVarA);
                    bVar2.p(objV6);
                }
                Function1 function1 = (Function1) objV6;
                boolean zK2 = bVar2.K(g4aVarA) | bVar2.x(pk1.this);
                pk1 pk1Var7 = pk1.this;
                Object objV7 = bVar2.v();
                if (zK2 || objV7 == c0020a) {
                    objV7 = new tk1(pk1Var7, g4aVarA);
                    bVar2.p(objV7);
                }
                zde.a(pb2Var2, dVar2, hw9Var, hkdVarY, function1, (Function1) objV7, bVar2, (iIntValue & 14) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            }
            return j6g.a;
        }
    }

    public pk1(hw9 hw9Var) {
        this.c = hw9Var;
    }

    @Override // androidx.navigation.s
    public final k a() {
        ah2 ah2Var = oh2.a;
        return new a(this);
    }

    @Override // androidx.navigation.s
    public final void d(List list, p pVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b().h((d) list.get(i));
        }
    }

    @Override // androidx.navigation.s
    public final void e(e.a aVar) {
        super.e(aVar);
        ((gme) this.d).setValue(Boolean.TRUE);
    }

    @Override // androidx.navigation.s
    public final void i(d dVar, boolean z) {
        b().e(dVar, z);
    }
}
