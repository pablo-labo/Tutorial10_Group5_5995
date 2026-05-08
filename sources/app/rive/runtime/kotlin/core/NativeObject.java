package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.errors.RiveException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.a7e;
import defpackage.ja;
import defpackage.md4;
import defpackage.mj8;
import defpackage.r6e;
import defpackage.ut0;
import defpackage.w92;
import defpackage.wl7;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\tR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0005¨\u0006,"}, d2 = {"Lapp/rive/runtime/kotlin/core/NativeObject;", "Lapp/rive/runtime/kotlin/core/RefCount;", "", "unsafeCppPointer", "<init>", "(J)V", "", "Ljava/lang/StackTraceElement;", "buildCombinedStackTrace", "()Ljava/util/List;", "Lj6g;", "dispose", "()V", "pointer", "cppDelete", "", "acquire", "()I", "release", "J", "Lr6e;", "disposeStackTrace", "Lr6e;", "Ljava/util/concurrent/atomic/AtomicInteger;", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "", "dependencies", "Ljava/util/List;", "getDependencies", "", "getHasCppObject", "()Z", "hasCppObject", "value", "getCppPointer", "()J", "setCppPointer", "cppPointer", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public abstract class NativeObject implements RefCount {
    public static final long NULL_POINTER = 0;
    private final List<RefCount> dependencies;
    private r6e<StackTraceElement> disposeStackTrace;
    private AtomicInteger refs;
    private long unsafeCppPointer;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.NativeObject$buildCombinedStackTrace$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/StackTraceElement;)Ljava/lang/Boolean;"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements Function1<StackTraceElement, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(StackTraceElement stackTraceElement) {
            return Boolean.valueOf(!wl7.b(stackTraceElement.getClassName(), NativeObject.class.getName()));
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.NativeObject$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/StackTraceElement;)Ljava/lang/Boolean;"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<StackTraceElement, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(StackTraceElement stackTraceElement) {
            return Boolean.valueOf(!wl7.b(stackTraceElement.getClassName(), NativeObject.class.getName()));
        }
    }

    public NativeObject(long j) {
        this.unsafeCppPointer = j;
        this.refs = new AtomicInteger(this.unsafeCppPointer == 0 ? 0 : 1);
        this.dependencies = new ArrayList();
    }

    private final List<StackTraceElement> buildCombinedStackTrace() {
        ArrayList arrayList = new ArrayList();
        r6e<StackTraceElement> r6eVar = this.disposeStackTrace;
        if (r6eVar != null) {
            arrayList.add(new StackTraceElement("--- Stack Trace for NativeObject Dispose ---", "", null, -1));
            w92.v0(arrayList, r6eVar);
            arrayList.add(new StackTraceElement("--- Current Stack Trace ---", "", null, -1));
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        r6e r6eVarE0 = ut0.e0(stackTrace);
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        anonymousClass2.getClass();
        w92.v0(arrayList, a7e.Q(new md4(r6eVarE0, anonymousClass2), 1));
        return arrayList;
    }

    private final synchronized void dispose() {
        try {
            if (this.refs.get() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            stackTrace.getClass();
            r6e r6eVarE0 = ut0.e0(stackTrace);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            anonymousClass1.getClass();
            this.disposeStackTrace = new md4(r6eVarE0, anonymousClass1);
            List<RefCount> list = this.dependencies;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RefCount) it.next()).release();
            }
            list.clear();
            cppDelete(this.unsafeCppPointer);
            this.unsafeCppPointer = 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int acquire() {
        int iAcquire;
        iAcquire = RefCount.DefaultImpls.acquire(this);
        if (iAcquire <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return iAcquire;
    }

    public void cppDelete(long pointer) {
    }

    public final long getCppPointer() throws RiveException {
        if (getHasCppObject()) {
            return this.unsafeCppPointer;
        }
        RiveException riveException = new RiveException(ja.f(JwtParser.SEPARATOR_CHAR, "Accessing disposed C++ object ", getClass().getSimpleName()));
        riveException.setStackTrace((StackTraceElement[]) buildCombinedStackTrace().toArray(new StackTraceElement[0]));
        throw riveException;
    }

    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final boolean getHasCppObject() {
        return this.unsafeCppPointer != 0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final AtomicInteger getRefs() {
        return this.refs;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int release() {
        int iRelease;
        iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRelease == 0 && getHasCppObject()) {
            dispose();
        }
        return iRelease;
    }

    public final void setCppPointer(long j) {
        this.unsafeCppPointer = j;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final void setRefs(AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        this.refs = atomicInteger;
    }
}
