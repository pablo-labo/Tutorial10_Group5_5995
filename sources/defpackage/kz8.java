package defpackage;

import com.facebook.react.modules.toast.ToastModule;
import defpackage.lz8;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kz8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kz8(ToastModule toastModule, String str, int i) {
        this.c = toastModule;
        this.d = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                lz8.a aVar = (lz8.a) obj;
                for (lz8.c cVar : (CopyOnWriteArraySet) obj2) {
                    if (!cVar.d) {
                        if (i2 != -1) {
                            cVar.b.a(i2);
                        }
                        cVar.c = true;
                        aVar.invoke(cVar.a);
                    }
                }
                break;
            default:
                ToastModule.show$lambda$0((ToastModule) obj2, (String) obj, i2);
                break;
        }
    }

    public /* synthetic */ kz8(CopyOnWriteArraySet copyOnWriteArraySet, int i, lz8.a aVar) {
        this.c = copyOnWriteArraySet;
        this.b = i;
        this.d = aVar;
    }
}
