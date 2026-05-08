package defpackage;

import android.database.Cursor;
import defpackage.mfd;
import defpackage.r2b;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rB-\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\u0012J*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010 J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004H\u0094@¢\u0006\u0004\b\u001f\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lpw8;", "", "Value", "Lr2b;", "", "Lkfd;", "sourceQuery", "Lxed;", "db", "", "", "tables", "<init>", "(Lkfd;Lxed;[Ljava/lang/String;)V", "Lmfd;", "(Lmfd;Lxed;[Ljava/lang/String;)V", "Lxze;", "supportSQLiteQuery", "(Lxze;Lxed;[Ljava/lang/String;)V", "Lr2b$a;", "params", "Lr2b$b;", "load", "(Lr2b$a;Llu2;)Ljava/lang/Object;", "Ls2b;", "state", "getRefreshKey", "(Ls2b;)Ljava/lang/Integer;", "Landroid/database/Cursor;", "cursor", "", "convertRows", "(Landroid/database/Cursor;)Ljava/util/List;", "limitOffsetQuery", "itemCount", "(Lkfd;ILlu2;)Ljava/lang/Object;", "Lkfd;", "getSourceQuery", "()Lkfd;", "Lxed;", "getDb", "()Lxed;", "Loc2;", "implementation", "Loc2;", "getItemCount", "()I", "", "getJumpingSupported", "()Z", "jumpingSupported", "room-paging_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class pw8<Value> extends r2b<Integer, Value> {
    private final xed db;
    private final oc2<Value> implementation;
    private final kfd sourceQuery;

    public /* synthetic */ class a extends qv5 implements wu5<kfd, Integer, lu2<? super List<? extends Value>>, Object> {
        @Override // defpackage.wu5
        public final Object q(kfd kfdVar, Integer num, Object obj) {
            return ((pw8) this.receiver).convertRows(kfdVar, num.intValue(), (lu2) obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pw8(xze xzeVar, xed xedVar, String... strArr) {
        xzeVar.getClass();
        xedVar.getClass();
        strArr.getClass();
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(xzeVar.a(), xzeVar.h());
        xzeVar.p(new lfd(mfdVarA));
        this(new kfd(mfdVarA.h(), new pe0(mfdVarA, 12)), xedVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List convertRows$lambda$1(kfd kfdVar, pw8 pw8Var, int i, zhd zhdVar) {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(kfdVar.a);
        try {
            kfdVar.b.invoke(iidVarQ1);
            List<Value> listConvertRows = pw8Var.convertRows(new jid(iidVarQ1, i));
            pi3.d(iidVarQ1, null);
            return listConvertRows;
        } finally {
        }
    }

    public static /* synthetic */ <Value> Object convertRows$suspendImpl(final pw8<Value> pw8Var, final kfd kfdVar, final int i, lu2<? super List<? extends Value>> lu2Var) {
        return pg8.H(lu2Var, ((pw8) pw8Var).db, new Function1() { // from class: ow8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pw8.convertRows$lambda$1(kfdVar, pw8Var, i, (zhd) obj);
            }
        }, true, false);
    }

    public static /* synthetic */ <Value> Object load$suspendImpl(pw8<Value> pw8Var, r2b.a<Integer> aVar, lu2<? super r2b.b<Integer, Value>> lu2Var) {
        return ((pw8) pw8Var).implementation.a(aVar, lu2Var);
    }

    public List<Value> convertRows(Cursor cursor) {
        cursor.getClass();
        throw new ela("Unexpected call to a function with no implementation that Room is suppose to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568.");
    }

    public final xed getDb() {
        return this.db;
    }

    public final int getItemCount() {
        return this.implementation.f.get();
    }

    @Override // defpackage.r2b
    public boolean getJumpingSupported() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.r2b
    public Integer getRefreshKey(s2b<Integer, Value> state) {
        state.getClass();
        if (state.b != null) {
            return Integer.valueOf(Math.max(0, r0.intValue() - 10));
        }
        return null;
    }

    public final kfd getSourceQuery() {
        return this.sourceQuery;
    }

    @Override // defpackage.r2b
    public Object load(r2b.a<Integer> aVar, lu2<? super r2b.b<Integer, Value>> lu2Var) {
        return load$suspendImpl(this, aVar, lu2Var);
    }

    public Object convertRows(kfd kfdVar, int i, lu2<? super List<? extends Value>> lu2Var) {
        return convertRows$suspendImpl(this, kfdVar, i, lu2Var);
    }

    public pw8(kfd kfdVar, xed xedVar, String... strArr) {
        kfdVar.getClass();
        xedVar.getClass();
        strArr.getClass();
        this.sourceQuery = kfdVar;
        this.db = xedVar;
        this.implementation = new oc2<>(strArr, this, new a(3, this, pw8.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pw8(mfd mfdVar, xed xedVar, String... strArr) {
        this(new kfd(mfdVar.h(), new pe0(mfdVar, 12)), xedVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        mfdVar.getClass();
        xedVar.getClass();
        strArr.getClass();
    }
}
