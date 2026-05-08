package expo.modules.interfaces.taskManager;

import android.content.Context;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ak2;
import defpackage.c45;
import defpackage.cy9;
import defpackage.fwc;
import defpackage.iwc;
import defpackage.kya;
import defpackage.saf;
import defpackage.z92;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;", "", "<init>", "()V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lsaf;", "getTaskServiceImpl", "(Landroid/content/Context;)Lsaf;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskServiceProviderHelper {

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Map<String, Integer> map = cy9.a;
            Class<?> cls = ((kya) t2).getClass();
            iwc iwcVar = fwc.a;
            return ak2.i(Integer.valueOf(cy9.a(iwcVar.b(cls).p())), Integer.valueOf(cy9.a(iwcVar.b(((kya) t).getClass()).p())));
        }
    }

    static {
        new TaskServiceProviderHelper();
    }

    private TaskServiceProviderHelper() {
    }

    public final saf getTaskServiceImpl(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        context.getClass();
        Method method = c45.class.getMethod("getPackageList", null);
        if (method != null) {
            Object objInvoke = method.invoke(null, null);
            List list = objInvoke instanceof List ? (List) objInvoke : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof kya) {
                        arrayList.add(obj);
                    }
                }
                List listP1 = z92.p1(arrayList, new a());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listP1) {
                    if (obj2 instanceof TaskServiceProviderInterface) {
                        arrayList2.add(obj2);
                    }
                }
                TaskServiceProviderInterface taskServiceProviderInterface = (TaskServiceProviderInterface) z92.Q0(arrayList2);
                if (taskServiceProviderInterface != null) {
                    taskServiceProviderInterface.c();
                }
            }
        }
        return null;
    }
}
