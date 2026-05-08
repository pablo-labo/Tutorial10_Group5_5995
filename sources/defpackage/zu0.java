package defpackage;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.p3c;
import defpackage.sp7;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zu0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        CodedException unexpectedException;
        CodedException codedException;
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                PromiseImpl promiseImpl = (PromiseImpl) obj5;
                dv0 dv0Var = (dv0) obj4;
                String str = (String) obj3;
                try {
                    dv0Var.g((Object[]) obj2, promiseImpl, (gk0) obj);
                    j6g j6gVar = j6g.a;
                    return j6g.a;
                } catch (Throwable th) {
                    try {
                        throw new FunctionCallException(dv0Var.a, str, !(th instanceof CodedException) ? th instanceof expo.modules.core.errors.CodedException ? new CodedException(((expo.modules.core.errors.CodedException) th).a(), ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause()) : new UnexpectedException(th) : (CodedException) th);
                    } catch (Throwable th2) {
                        if (promiseImpl.a) {
                            throw th2;
                        }
                        if (th2 instanceof CodedException) {
                            codedException = (CodedException) th2;
                        } else {
                            if (th2 instanceof expo.modules.core.errors.CodedException) {
                                expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th2;
                                unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                            } else {
                                unexpectedException = new UnexpectedException(th2);
                            }
                            codedException = unexpectedException;
                        }
                        p3c.a.a(promiseImpl, codedException);
                    }
                }
                break;
            case 1:
                Function1 function1 = (Function1) obj5;
                m61 m61Var = (m61) obj4;
                g4a g4aVar = (g4a) obj3;
                g4a g4aVar2 = (g4a) obj2;
                g4a g4aVar3 = (g4a) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-award", "save", null, null, 12));
                function1.invoke(new m61(m61Var != null ? m61Var.a : null, (tg3) g4aVar2.getValue(), (String) g4aVar3.getValue(), (String) g4aVar.getValue()));
                return j6g.a;
            default:
                EventRecord.Attachment attachment = (EventRecord.Attachment) obj5;
                ra9 ra9Var = (ra9) obj4;
                ra9 ra9Var2 = (ra9) obj3;
                ra9 ra9Var3 = (ra9) obj2;
                ra9 ra9Var4 = (ra9) obj;
                String fileExtensionTrimmed = attachment.getFileExtensionTrimmed();
                switch (fileExtensionTrimmed.hashCode()) {
                    case 105441:
                        if (fileExtensionTrimmed.equals("jpg")) {
                            ra9Var3.a(attachment.getFileName());
                        }
                        break;
                    case 110834:
                        if (fileExtensionTrimmed.equals("pdf")) {
                            ra9Var.a(attachment.getFileName());
                        }
                        break;
                    case 111145:
                        if (fileExtensionTrimmed.equals("png")) {
                            ra9Var2.a(attachment.getFileName());
                        }
                        break;
                    case 3268712:
                        if (fileExtensionTrimmed.equals("jpeg")) {
                            ra9Var4.a(attachment.getFileName());
                        }
                        break;
                }
                return j6g.a;
        }
    }
}
