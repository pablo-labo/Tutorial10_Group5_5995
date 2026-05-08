package defpackage;

import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.Command;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j98 implements jm1 {
    public final /* synthetic */ k98 a;
    public final /* synthetic */ Function1<nhb, j6g> b;
    public final /* synthetic */ Function1<ShowSearchOverlayData, j6g> c;
    public final /* synthetic */ Function1<DisplayToastData, j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    public j98(k98 k98Var, Function1<? super nhb, j6g> function1, Function1<? super ShowSearchOverlayData, j6g> function12, Function1<? super DisplayToastData, j6g> function13) {
        this.a = k98Var;
        this.b = function1;
        this.c = function12;
        this.d = function13;
    }

    @Override // defpackage.jm1
    public final void a(Command command, BridgeDispatcher.c cVar) {
        command.getClass();
        rm1.a(this.a.a, command, cVar, this.b, this.c, this.d);
    }
}
