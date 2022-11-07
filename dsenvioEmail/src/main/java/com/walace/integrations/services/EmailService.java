package com.walace.integrations.services;

import com.walace.integrations.dto.EmailDTO;

public interface EmailService {

	void sendPlainTextEmail(EmailDTO dto);
}
