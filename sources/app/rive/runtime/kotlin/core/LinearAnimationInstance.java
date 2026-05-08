package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.j6g;
import defpackage.l;
import defpackage.r6;
import defpackage.sy3;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b%\u0010\"J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b'\u0010(J \u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010)\u001a\u00020&H\u0082 ¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b-\u0010(J \u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020&H\u0082 ¢\u0006\u0004\b/\u0010+J\u0018\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b3\u0010(J\u0018\u00104\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b4\u0010(J\u0018\u00105\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b5\u0010(J\u0018\u00106\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b6\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u001cR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010:R$\u0010>\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010G\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0011\u0010I\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0011\u0010K\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bJ\u0010DR\u0011\u0010M\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bL\u0010DR\u0011\u0010O\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bN\u0010DR\u0014\u0010R\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bS\u0010:R\u0011\u0010V\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bU\u0010:R$\u0010W\u001a\u00020\u00102\u0006\u0010W\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "mix", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;F)V", "pointer", "Lj6g;", "cppDelete", "(J)V", "elapsedTime", "Lapp/rive/runtime/kotlin/core/Loop;", "advance", "(F)Lapp/rive/runtime/kotlin/core/Loop;", "Lapp/rive/runtime/kotlin/core/AdvanceResult;", "advanceAndGetResult", "(F)Lapp/rive/runtime/kotlin/core/AdvanceResult;", "apply", "()V", "elapsed", "", "(F)Z", "time", "(F)V", "cppAdvance", "(JF)Lapp/rive/runtime/kotlin/core/Loop;", "cppAdvanceAndGetResult", "(JF)Lapp/rive/runtime/kotlin/core/AdvanceResult;", "cppApply", "(JF)V", "cppGetTime", "(J)F", "cppSetTime", "", "cppGetDirection", "(J)I", "int", "cppSetDirection", "(JI)V", "cppPointer", "cppGetLoop", "value", "cppSetLoop", "", "cppName", "(J)Ljava/lang/String;", "cppDuration", "cppFps", "cppWorkStart", "cppWorkEnd", "Ljava/util/concurrent/locks/ReentrantLock;", "F", "getMix", "()F", "setMix", "getTime", "Lapp/rive/runtime/kotlin/core/Direction;", "direction", "getDirection", "()Lapp/rive/runtime/kotlin/core/Direction;", "setDirection", "(Lapp/rive/runtime/kotlin/core/Direction;)V", "getDuration", "()I", "duration", "getEffectiveDuration", "effectiveDuration", "getEffectiveDurationInSeconds", "effectiveDurationInSeconds", "getFps", "fps", "getWorkStart", "workStart", "getWorkEnd", "workEnd", "getName", "()Ljava/lang/String;", "name", "getStartTime", "startTime", "getEndTime", "endTime", "loop", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class LinearAnimationInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private float mix;

    @Metadata(k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearAnimationInstance(long j, ReentrantLock reentrantLock, float f) {
        super(j);
        reentrantLock.getClass();
        this.lock = reentrantLock;
        this.mix = f;
    }

    private final native Loop cppAdvance(long pointer, float elapsedTime);

    private final native AdvanceResult cppAdvanceAndGetResult(long pointer, float elapsedTime);

    private final native void cppApply(long pointer, float mix);

    private final native int cppDuration(long cppPointer);

    private final native int cppFps(long cppPointer);

    private final native int cppGetDirection(long pointer);

    private final native int cppGetLoop(long cppPointer);

    private final native float cppGetTime(long pointer);

    private final native String cppName(long cppPointer);

    private final native void cppSetDirection(long pointer, int i);

    private final native void cppSetLoop(long cppPointer, int value);

    private final native void cppSetTime(long pointer, float time);

    private final native int cppWorkEnd(long cppPointer);

    private final native int cppWorkStart(long cppPointer);

    @sy3
    public final Loop advance(float elapsedTime) {
        Loop loopCppAdvance;
        synchronized (this.lock) {
            loopCppAdvance = cppAdvance(getCppPointer(), elapsedTime);
        }
        return loopCppAdvance;
    }

    public final AdvanceResult advanceAndGetResult(float elapsedTime) {
        AdvanceResult advanceResultCppAdvanceAndGetResult;
        synchronized (this.lock) {
            advanceResultCppAdvanceAndGetResult = cppAdvanceAndGetResult(getCppPointer(), elapsedTime);
        }
        return advanceResultCppAdvanceAndGetResult;
    }

    public final boolean apply(float elapsed) {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
            j6g j6gVar = j6g.a;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[advanceAndGetResult(elapsed).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i != 4 && i != 5) {
            l.g();
        }
        return false;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public final Direction getDirection() {
        Direction directionFromInt = Direction.INSTANCE.fromInt(cppGetDirection(getCppPointer()));
        if (directionFromInt != null) {
            return directionFromInt;
        }
        r6.g("Check failed.");
        return null;
    }

    public final int getDuration() {
        return cppDuration(getCppPointer());
    }

    public final int getEffectiveDuration() {
        return getWorkStart() == -1 ? getDuration() : getWorkEnd() - getWorkStart();
    }

    public final float getEffectiveDurationInSeconds() {
        return getEffectiveDuration() / getFps();
    }

    public final float getEndTime() {
        float workEnd;
        int fps;
        if (getWorkEnd() == -1) {
            workEnd = getDuration();
            fps = getFps();
        } else {
            workEnd = getWorkEnd();
            fps = getFps();
        }
        return workEnd / fps;
    }

    public final int getFps() {
        return cppFps(getCppPointer());
    }

    public final Loop getLoop() {
        return Loop.INSTANCE.fromIndex(cppGetLoop(getCppPointer()));
    }

    public final float getMix() {
        return this.mix;
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final float getStartTime() {
        if (getWorkStart() == -1) {
            return 0.0f;
        }
        return getWorkStart() / getFps();
    }

    public final float getTime() {
        return cppGetTime(getCppPointer());
    }

    public final int getWorkEnd() {
        return cppWorkEnd(getCppPointer());
    }

    public final int getWorkStart() {
        return cppWorkStart(getCppPointer());
    }

    public final void setDirection(Direction direction) {
        direction.getClass();
        synchronized (this.lock) {
            cppSetDirection(getCppPointer(), direction.getValue());
            j6g j6gVar = j6g.a;
        }
    }

    public final void setLoop(Loop loop) {
        loop.getClass();
        synchronized (this.lock) {
            cppSetLoop(getCppPointer(), loop.ordinal());
            j6g j6gVar = j6g.a;
        }
    }

    public final void setMix(float f) {
        this.mix = f;
    }

    public final void time(float time) {
        synchronized (this.lock) {
            cppSetTime(getCppPointer(), time);
            j6g j6gVar = j6g.a;
        }
    }

    public /* synthetic */ LinearAnimationInstance(long j, ReentrantLock reentrantLock, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, reentrantLock, (i & 4) != 0 ? 1.0f : f);
    }

    public final void apply() {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
            j6g j6gVar = j6g.a;
        }
    }
}
