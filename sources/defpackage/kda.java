package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class kda implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kda(String str, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                wda wdaVar = (wda) obj;
                yca ycaVar = wdaVar.l;
                IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
                zze zzeVarC = ycaVar.c();
                zzeVarC.n(1, str);
                try {
                    indeedAppDatabase_Impl.c();
                    try {
                        zzeVarC.J();
                        indeedAppDatabase_Impl.w();
                        return j6g.a;
                    } finally {
                        indeedAppDatabase_Impl.s();
                    }
                } finally {
                    ycaVar.g(zzeVarC);
                }
            default:
                eig eigVar = (eig) obj;
                cig cigVar = eigVar.c;
                IndeedAppDatabase_Impl indeedAppDatabase_Impl2 = eigVar.a;
                zze zzeVarC2 = cigVar.c();
                zzeVarC2.n(1, str);
                try {
                    indeedAppDatabase_Impl2.c();
                    try {
                        zzeVarC2.J();
                        indeedAppDatabase_Impl2.w();
                        return j6g.a;
                    } finally {
                        indeedAppDatabase_Impl2.s();
                    }
                } finally {
                    cigVar.g(zzeVarC2);
                }
        }
    }
}
