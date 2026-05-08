package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.RefCount;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.qo3;
import defpackage.zv8;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lapp/rive/runtime/kotlin/RiveViewLifecycleObserver;", "Lqo3;", "", "Lapp/rive/runtime/kotlin/core/RefCount;", "dependencies", "<init>", "(Ljava/util/List;)V", "Lzv8;", "owner", "Lj6g;", "onCreate", "(Lzv8;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "dependency", "", "remove", "(Lapp/rive/runtime/kotlin/core/RefCount;)Z", "insert", "(Lapp/rive/runtime/kotlin/core/RefCount;)V", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public class RiveViewLifecycleObserver implements qo3 {
    public static final int $stable = 8;
    private final List<RefCount> dependencies;

    public RiveViewLifecycleObserver(List<RefCount> list) {
        list.getClass();
        this.dependencies = list;
    }

    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final void insert(RefCount dependency) {
        dependency.getClass();
        this.dependencies.add(dependency);
    }

    @Override // defpackage.qo3
    public void onCreate(zv8 owner) {
        owner.getClass();
    }

    @Override // defpackage.qo3
    public void onDestroy(zv8 owner) {
        owner.getClass();
        Iterator<T> it = this.dependencies.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        owner.getLifecycle().c(this);
    }

    @Override // defpackage.qo3
    public void onPause(zv8 owner) {
        owner.getClass();
    }

    @Override // defpackage.qo3
    public void onResume(zv8 owner) {
        owner.getClass();
    }

    @Override // defpackage.qo3
    public void onStart(zv8 owner) {
        owner.getClass();
    }

    @Override // defpackage.qo3
    public void onStop(zv8 owner) {
        owner.getClass();
    }

    public final boolean remove(RefCount dependency) {
        dependency.getClass();
        return this.dependencies.remove(dependency);
    }
}
