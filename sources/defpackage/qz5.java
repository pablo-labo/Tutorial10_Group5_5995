package defpackage;

import androidx.media3.ui.d;
import com.swmansion.gesturehandler.core.GestureHandler;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qz5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ qz5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        switch (this.a) {
            case 0:
                GestureHandler gestureHandler = (GestureHandler) obj;
                GestureHandler gestureHandler2 = (GestureHandler) obj2;
                boolean z2 = gestureHandler.G;
                if ((z2 && gestureHandler2.G) || ((z = gestureHandler.H) && gestureHandler2.H)) {
                    return Integer.signum(gestureHandler2.F - gestureHandler.F);
                }
                if (!z2) {
                    if (!gestureHandler2.G) {
                        if (!z) {
                            if (!gestureHandler2.H) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                d.b bVar = (d.b) obj;
                d.b bVar2 = (d.b) obj2;
                int iCompare = Integer.compare(bVar2.a, bVar.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = bVar2.c.compareTo(bVar.c);
                return iCompareTo != 0 ? iCompareTo : bVar2.d.compareTo(bVar.d);
        }
    }
}
