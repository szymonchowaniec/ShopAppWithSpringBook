package pl.szymonchowaniec.webstore.domain.repository;

import pl.szymonchowaniec.webstore.domain.Cart;

public interface CartRepository {

    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
    void delete(String cartId);
}
