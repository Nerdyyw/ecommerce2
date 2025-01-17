package com.example.ecom.order.domain.user.repository;

import com.example.ecom.order.domain.user.aggregate.User;
import com.example.ecom.order.domain.user.vo.UserAddress;
import com.example.ecom.order.domain.user.vo.UserAddressToUpdate;
import com.example.ecom.order.domain.user.vo.UserEmail;
import com.example.ecom.order.domain.user.vo.UserPublicId;

import java.util.Optional;

public interface UserRepository {

  void save(User user);

  Optional<User> get(UserPublicId userPublicId);

  Optional<User> getOneByEmail(UserEmail userEmail);

  void updateAddress(UserPublicId userPublicId, UserAddressToUpdate userAddress);

}
