package com.iemr.common.identity.repo.rmnch;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.common.identity.data.rmnch.RMNCHMBeneficiaryServiceMap;

@Repository
public interface RMNCHMBeneficiaryServiceMapRepo extends CrudRepository<RMNCHMBeneficiaryServiceMap, BigInteger> {
	@Query(" SELECT t FROM RMNCHMBeneficiaryServiceMap t WHERE t.id = :vanSerialNo AND t.VanID = :vanID")
	public RMNCHMBeneficiaryServiceMap getByIdAndVanID(@Param("vanSerialNo") Long vanSerialNo,
			@Param("vanID") int vanID);
}
