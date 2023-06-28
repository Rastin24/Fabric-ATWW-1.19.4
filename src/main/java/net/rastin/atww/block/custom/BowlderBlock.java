package net.rastin.atww.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BowlderBlock extends Block {

    public BowlderBlock(Settings settings) {
        super(settings);
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4, 0.0, 4, 12, 8, 12);
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }

}