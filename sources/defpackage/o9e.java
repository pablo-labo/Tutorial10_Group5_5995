package defpackage;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
public final class o9e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<Message> $messages;
    int label;
    final /* synthetic */ n9e this$0;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9e(n9e n9eVar, List<Message> list, lu2<? super o9e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = n9eVar;
        this.$messages = list;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new o9e(this.this$0, this.$messages, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o9e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            dg5 dg5Var = dg5.a;
            this.label = 1;
            obj = dg5Var.b(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            } else {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((z9e) it.next()).a()) {
                        List<Message> listP1 = z92.p1(z92.M0(u63.d0(n9e.a(this.this$0, this.$messages, 2), n9e.a(this.this$0, this.$messages, 1))), new a());
                        n9e n9eVar = this.this$0;
                        for (Message message : listP1) {
                            if (n9eVar.b != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = n9eVar.b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                                    n9eVar.b(message);
                                }
                            } else {
                                n9eVar.b(message);
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
        }
        return j6g.a;
    }
}
