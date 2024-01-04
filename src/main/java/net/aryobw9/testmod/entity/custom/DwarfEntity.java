package net.aryobw9.testmod.entity.custom;

import net.aryobw9.testmod.entity.ModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class DwarfEntity extends Animal {
    public DwarfEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeOut = 0;

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()){
            setupAnimationState();

        }
    }
    private void setupAnimationState(){
        if (this.idleAnimationTimeOut<=0){
            this.idleAnimationTimeOut = this.random.nextInt(40)+80;
            this.idleAnimationState.start(this.tickCount);
        }else {
            --this.idleAnimationTimeOut;
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose()== Pose.STANDING){
            f = Math.min(pPartialTick = 6f, 1f);
        } else {
            f= 0f;
        }
        this.walkAnimation.update(f,0.2f);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new FleeSunGoal(this, 5d));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 2d));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.150, Ingredient.of(Items.GOLD_NUGGET),false));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 4f));
        this.goalSelector.addGoal(5,new BreedGoal(this, 4d));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));

    }

    public static AttributeSupplier.Builder createAttribute(){
        return Animal.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 4d)
                .add(Attributes.FOLLOW_RANGE, 10d)
                .add(Attributes.MAX_HEALTH, 10d)
                .add(Attributes.MOVEMENT_SPEED, 0.23d)
                .add(Attributes.ARMOR, 4f)
                .add(Attributes.ATTACK_KNOCKBACK, 1f)
                .add(Attributes.ATTACK_SPEED, 5d)
                .add(Attributes.JUMP_STRENGTH, 1d);
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.DWARF.get().create(pLevel);
    }
    @Override
    public boolean isFood(ItemStack pStack){
        return pStack.is(Items.GOLD_NUGGET);
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.VILLAGER_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.SCULK_CLICKING_STOP;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.WARDEN_AMBIENT;
    }

}
