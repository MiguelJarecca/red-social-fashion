import { configureStore } from '@reduxjs/toolkit';
import { schoolSlice } from './slices/schools/schoolsSlice';
import { uniformSlice } from './slices/schools/uniformSlice';
import { cartSlice } from './slices/cart/cartSlice';
import { wishlistSlice } from './slices/wishlist/wishlistSlice';


export const store = configureStore({
    reducer: {
        schools: schoolSlice.reducer,
        uniforms: uniformSlice.reducer,
        cart: cartSlice.reducer,
        wishlist: wishlistSlice.reducer,
    }
});